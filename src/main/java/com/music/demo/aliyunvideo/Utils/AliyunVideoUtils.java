package com.music.demo.aliyunvideo.Utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.vod.model.v20170321.*;
import com.music.demo.aliyunvideo.vo.aliyunvo.BaseVideoVO;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.ServerException;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AliyunVideoUtils {
    private static String accessKeyId = "LTAI7C6TrjDTmpie";
    private static String accessKeySecret = "O9XHBbCEouna0tLFkvma3ne77b9Zc8";
    private static String httpAli = "http://vod.cn-shanghai.aliyuncs.com";
    private static DefaultAcsClient aliyunClient;

    AliyunVideoUtils() {

    }

    private static DefaultAcsClient getAliyunClient() {
        if (aliyunClient == null) {
            aliyunClient = new DefaultAcsClient(
                    DefaultProfile.getProfile("cn-shanghai", accessKeyId, accessKeySecret));
        }
        return aliyunClient;
    }


    private static DefaultProfile getDefaultProfile() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKeyId, accessKeySecret);
        return profile;
    }



  private   static String getVideoPlayAuth(DefaultAcsClient client,String vid) {
        GetVideoPlayAuthRequest request = new GetVideoPlayAuthRequest();
        request.setVideoId(vid);
        GetVideoPlayAuthResponse response = null;
        try {
            response = client.getAcsResponse(request);

        } catch (ClientException e) {
            throw new RuntimeException("GetVideoPlayAuthRequest Client failed");
        }
       String playAuth =  response.getPlayAuth();              //播放凭证
        GetVideoPlayAuthResponse.VideoMeta videoMeta = response.getVideoMeta();             //视频Meta信息
        return playAuth;
    }

 public static String  getPlayAuth (String vid){
     DefaultAcsClient  client = new DefaultAcsClient(getDefaultProfile());
     return getVideoPlayAuth(client,vid);

 }


    private static DefaultProfile initgetPlayAuth () {
        DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", accessKeyId, accessKeySecret);
        return profile;
    }

    /**
     * @return VideoID
     */
    public static String[] createUploadVideo() {
        CreateUploadVideoRequest request = new CreateUploadVideoRequest();
        CreateUploadVideoResponse response = null;
        try {
              /*必选，视频源文件名称（必须带后缀, 支持 ".3gp", ".asf", ".avi", ".dat", ".dv", ".flv", ".f4v", ".gif", ".m2t", ".m3u8", ".m4v", ".mj2", ".mjpeg", ".mkv", ".mov", ".mp4", ".mpe", ".mpg", ".mpeg", ".mts", ".ogg", ".qt", ".rm", ".rmvb", ".swf", ".ts", ".vob", ".wmv", ".webm"".aac", ".ac3", ".acm", ".amr", ".ape", ".caf", ".flac", ".m4a", ".mp3", ".ra", ".wav", ".wma"）*/
            request.setFileName("源文件名称.mp4");
            //必选，视频标题
            request.setTitle("视频标题");
            //可选，分类ID
            request.setCateId(0);
            //可选，视频标签，多个用逗号分隔
            request.setTags("标签1,标签2");
            //可选，视频描述
            request.setDescription("视频描述");
            response = getAliyunClient().getAcsResponse(request);

        } catch (ClientException e) {
            System.out.println("CreateUploadVideoRequest Client Exception:");
            e.printStackTrace();
            return null;
        }
        System.out.println("RequestId:" + response.getRequestId());
        System.out.println("UploadAuth:" + response.getUploadAuth());
        System.out.println("UploadAddress:" + response.getUploadAddress());
        String[] args = {response.getVideoId(), response.getUploadAuth(), response.getUploadAddress(), response.getRequestId()};
        return args;
    }

    public static String[] refreshUploadVideo(String videoId) {
        RefreshUploadVideoRequest request = new RefreshUploadVideoRequest();
        RefreshUploadVideoResponse response = null;
        try {
            request.setVideoId(videoId);
            response = getAliyunClient().getAcsResponse(request);

        } catch (ClientException e) {
            System.out.println("RefreshUploadVideoRequest Client Exception:");
            e.printStackTrace();
            return null;
        }
        System.out.println("RequestId:" + response.getRequestId());
        System.out.println("UploadAuth:" + response.getUploadAuth());
        String[] args = {response.getRequestId(), response.getUploadAuth()};
        return args;

    }

    private static String getHttpString(BaseVideoVO basevo, BaseVideoVO vo) throws Exception {
        List<String> parlsit = getAllParams(VOUtils.voReflect(basevo), VOUtils.voReflect(vo));
        String cqs = getCQS(parlsit);
        String StringToSign = "GET" + "&" + percentEncode("/") + "&" + percentEncode(cqs);
        String Signature = newStringByBase64(hmacSHA1Signature(accessKeySecret, StringToSign));
        String httpStr = cqs + "&Signature=" + Signature;
        return httpStr;
    }

    public static String getAliyunVideoReturn(BaseVideoVO basevo, BaseVideoVO vo) throws Exception {
        String httpStr ,returnStr ="";
        try {
            httpStr = getHttpString(basevo, vo);
             returnStr = HttpRequest.sendGet(httpAli,httpStr);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("阿里云调用失败");
        }
//        String[] args = httpStr.split(" ?");

        return returnStr;
    }

    public static String generateRandom() {
        String signatureNonce = UUID.randomUUID().toString();
        return signatureNonce;
    }

    /*生成当前UTC时间戳Time*/
    public static String generateTimestamp() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return df.format(date);
    }

    public static String newStringByBase64(byte[] bytes)
            throws UnsupportedEncodingException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return new String(new BASE64Encoder().encode(bytes));
    }

    public static byte[] hmacSHA1Signature(String accessKeySecret, String stringToSign) {
        try {
            String key = accessKeySecret + "&";
            try {
                SecretKeySpec signKey = new SecretKeySpec(key.getBytes(), "HmacSHA1");
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(signKey);
                return mac.doFinal(stringToSign.getBytes());
            } catch (Exception e) {
                throw new SignatureException("Failed to generate HMAC : " + e.getMessage());
            }
        } catch (SignatureException e) {
            e.printStackTrace();
        }
        return null;
    }


    /*特殊字符替换为转义字符*/
    public static String percentEncode(String value) {
        try {
            String urlEncodeOrignStr = URLEncoder.encode(value, "UTF-8");
            String plusReplaced = urlEncodeOrignStr.replace("+", "%20");
            String starReplaced = plusReplaced.replace("*", "%2A");
            String waveReplaced = starReplaced.replace("%7E", "~");
            return waveReplaced;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }

    /*对所有参数名称和参数值做URL编码*/
    public static List<String> getAllParams(Map<String, String> publicParams, Map<String, String> privateParams) {
        List<String> encodeParams = new ArrayList<String>();
        if (publicParams != null) {
            for (String key : publicParams.keySet()) {
                String value = publicParams.get(key);
                //将参数和值都urlEncode一下。
                String encodeKey = percentEncode(key);
                String encodeVal = percentEncode(value);
                encodeParams.add(encodeKey + "=" + encodeVal);
            }
        }
        if (privateParams != null) {
            for (String key : privateParams.keySet()) {
                String value = privateParams.get(key);
                //将参数和值都urlEncode一下。
                String encodeKey = percentEncode(key);
                String encodeVal = percentEncode(value);
                encodeParams.add(encodeKey + "=" + encodeVal);
            }
        }
        return encodeParams;
    }

    /*获取 CanonicalizedQueryString*/
    public static String getCQS(List<String> allParams) {
        ParamsComparator paramsComparator = new ParamsComparator();
        Collections.sort(allParams, paramsComparator);
        String cqString = "";
        for (int i = 0; i < allParams.size(); i++) {
            cqString += allParams.get(i);
            if (i != allParams.size() - 1) {
                cqString += "&";
            }
        }
        return cqString;
    }

    /*字符串参数比较器*/
    public static class ParamsComparator implements Comparator<String> {
        @Override
        public int compare(String lhs, String rhs) {
            return lhs.compareTo(rhs);
        }
    }

    public static void main(String[] args) {
//        DefaultAcsClient aliyunClient;
//        aliyunClient = new DefaultAcsClient(
//                DefaultProfile.getProfile("cn-shanghai",accessKeyId,accessKeySecret));
//
//        String[] videoId = createUploadVideo(aliyunClient);
//        System.out.println("VideoId:" + videoId);
//        //当网络异常导致文件上传失败时,可刷新上传凭证后再次执行上传操作
//        refreshUploadVideo(aliyunClient, videoId[0]);
    }
}
