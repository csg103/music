package com.music.demo.aliyunvideo.controller;


import com.music.demo.aliyunvideo.Utils.AliyunVideoUtils;
import com.music.demo.aliyunvideo.service.ALiYunService;
import com.music.demo.aliyunvideo.vo.aliyunvo.CreateUploadVideoVo;
import com.music.demo.aliyunvideo.vo.aliyunvo.GetVideoAddressVo;
import com.music.demo.aliyunvideo.vo.returnvo.AjaxResult;
import com.music.demo.dao.entity.mybatis.ProductDetail;
import com.music.demo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
public class ALiYunVideoController {

    @Autowired
    ALiYunService aLiYunService;
    @Autowired
    private ProductService productService;

    /**
     * 本地访问内容地址 ：http://localhost:3334/upload
     *
     * @param map
     * @return
     */
    @RequestMapping("/upload")
    public String helloHtml(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "control/upload";
    }

    /**
     * 获取阿里云上传视频的空间 和将要上传的视频的权限 ID
     *
     * @param createUploadVideoVo
     * @return
     */
    @RequestMapping("/getUploadAuth")
    @ResponseBody
    public AjaxResult getUploadAuth(@RequestBody CreateUploadVideoVo createUploadVideoVo) {
//        CreateUploadVideoVo createUploadVideoVo = new CreateUploadVideoVo();
        AjaxResult result = new AjaxResult();
        createUploadVideoVo.setAction("CreateUploadVideo");
        createUploadVideoVo.setCateId("71209652");
        if (!StringUtils.isEmpty(createUploadVideoVo.getModelFlag()))
            createUploadVideoVo.setTemplateGroupId("613c013504c0bb350eefffd2ae49b017");

        //{"UploadAddress":"eyJFbmRwb2ludCI6Imh0dHBzOi8vb3NzLWNuLXNoYW5naGFpLmFsaXl1bmNzLmNvbSIsIkJ1Y2tldCI6ImluLTIwMTgwMjI4MTcyNzEwNjU2LXM2b3VrOG95YXkiLCJGaWxlTmFtZSI6InZpZGVvLzE4ZGZjNDI0LTE2MzJiMjliY2Y4LTAwMDYtNDFmYi1mNWMtNDNjZGEubXA0In0=",
        // "VideoId":"8594a98b0a1d40d399a9d7d52bbb1404",
        // "RequestId":"82260F5B-69F8-4EC4-8B94-2E961FABE78C",
        // "UploadAuth":"eyJTZWN1cml0eVRva2VuIjoiQ0FJU3pBUjFxNkZ0NUIyeWZTaklwcXJOYytxQXVMNUpocXV0WVJIZ3MxVW5kT2hwalp6Q3FqejJJSHBOZTNocUIrMGZzUGt3bEdsVTZmZ2NsclVxRk1FY0dSU2NONVF1dDg4R3Exbi9KcGZadjh1ODRZQURpNUNqUVo4czRhMGhtSjI4V2Y3d2FmK0FVQm5HQ1RtZDVNY1lvOWJUY1RHbFFDWnVXLy90b0pWN2I5TVJjeENsWkQ1ZGZybC9MUmRqcjhsbzF4R3pVUEcyS1V6U24zYjNCa2hsc1JZZTcyUms4dmFIeGRhQXpSRGNnVmJtcUpjU3ZKK2pDNEM4WXM5Z0c1MTlYdHlwdm9weGJiR1Q4Q05aNXo5QTlxcDlrTTQ5L2l6YzdQNlFIMzViNFJpTkw4L1o3dFFOWHdoaWZmb2JIYTlZcmZIZ21OaGx2dkRTajQzdDF5dFZPZVpjWDBha1E1dTdrdTdaSFArb0x0OGphWXZqUDNQRTNyTHBNWUx1NFQ0OFpYVVNPRHREWWNaRFVIaHJFazRSVWpYZEk2T2Y4VXJXU1FDN1dzcjIxN290ZzdGeXlrM3M4TWFIQWtXTFg3U0IyRHdFQjRjNGFFb2tWVzRSeG5lelc2VUJhUkJwYmxkN0JxNmNWNWxPZEJSWm9LK0t6UXJKVFg5RXoycExtdUQ2ZS9MT3M3b0RWSjM3V1p0S3l1aDRZNDlkNFU4clZFalBRcWl5a1QwdEZncGZUSzFSemJQbU5MS205YmFCMjUvelcrUGREZTBkc1Znb0xGS0twaUdXRzNSTE5uK3p0Sjl4YUZ6ZG9aeUluUFNXcWNNNVQxRnh2NGdCVUYvQWFvaHFzbDgyNUxxNy9sT044ZVB1VlRmbzNCSmhxNFNFcGRFU3N4UThJcWY5MzdiRGhGT0U0aXpNTzV0ZXNkek1SV2hpVFM2d2YzRkUyLzJJamhvRjNVdGJ5ajdsWVVoQ3Nnck1pamJwSUpKRmpPYjM3M2RGRTdwVnArUFVjRDZwNVY1OEV1aU81N3NidWovVzQyV01ocDBhZ0FHdldJakRjVnpVZHJWc3laU0FIcm1Ed3M2byszVHBHdWxaano2d2U2U0ppRXpHWHVKVE1hVzVNb3NkWTFTekgyNXgwOHFyNnh5cUlCUDgrZW01UVFTbGZxOXdKL0NLS1VkMVdkRXR6dENpOXNqZGJGeUFzc2NzUmcrcVNMY3l6R29tSG1iTXlzVlgxR0c2SVBxY29LcDdrbTRJOVRIK0xURnd3eWJVbGJvemV3PT0iLCJBY2Nlc3NLZXlJZCI6IlNUUy5HaXg4UDRVYWgxaUZjN1FXVXJ4Z0ViWWlIIiwiQWNjZXNzS2V5U2VjcmV0IjoiNUFHb05NNk1zQWJnbUZrRDdBdWlrZzI0NUJmcjI3YzV2cnF6UDYxakdWVGQiLCJFeHBpcmF0aW9uIjoiMzYwMCJ9"}
//        8594a98b0a1d40d399a9d7d52bbb1404  0000010102002

        //上传视频提权，获得阿里云视频ID 空间 上传服务器 鉴权等信息
        String returnStr = "";
        try {
            returnStr = aLiYunService.getAliVideo(createUploadVideoVo);
        } catch (Exception e) {

            result.setCode("0");
            return result;

        }
        if (StringUtils.isEmpty(returnStr)) {

            result.setCode("0");
            return result;
        }
        //查询数据库中
        List<ProductDetail> list = productService.getProductMes(createUploadVideoVo);
        //组装将要保存的参数
        ProductDetail productDetail = aLiYunService.getSaveProductDetail(list, returnStr, createUploadVideoVo);


        //保存将要上传的视频ID
        productService.saveProductDetail(productDetail);
        result.setCode("1");
        result.setData(returnStr);
        return result;
    }


    @RequestMapping("/getPlayAuth")
    @ResponseBody
    public AjaxResult getPlayAuth(HashMap<String, Object> map) {
        AjaxResult result = new AjaxResult();
        GetVideoAddressVo getVideoAddressVo = new GetVideoAddressVo();
        getVideoAddressVo.setAction("GetPlayInfo");
        getVideoAddressVo.setVideoId("7f78577aa86c428aae7894bd2c08ff98");
        getVideoAddressVo.setFormats("HLS");
        getVideoAddressVo.setAuthTimeout("1800");
//            getVideoAddressVo.setStreamType("");
//            getVideoAddressVo.setDefinition("");
        String returnStr = "";
        try {
            returnStr = aLiYunService.getAliVideo(getVideoAddressVo);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode("0");
            return result;
        }

        result.setData(returnStr);
        return result;
//            return null;
    }


    @RequestMapping("/play")
    public String play(HashMap<String, Object> map) {
        String playAuth = AliyunVideoUtils.getPlayAuth("7f78577aa86c428aae7894bd2c08ff98");
        map.put("playAuth", playAuth);
        return "/play";
    }

    @RequestMapping("/updateUploadFlag")
    @ResponseBody
    public AjaxResult updateUploadFlag(@RequestBody ProductDetail productDetail) {
        AjaxResult result = new AjaxResult();
        int i = productService.updateUploadFlag(productDetail.getCourseTitle());
//           String playAuth = AliyunVideoUtils.  getPlayAuth("97b82913bd8346f087a6b5eed2820757");
//            map.put("playAuth", playAuth);
        if (i == 1) {
            result.setCode("1");
            result.setMessage("视频上传成功");
        } else if (i > 1) {
            result.setCode("0");
            result.setMessage("具有多个视频相同名称的视频状态已经被更改");
        } else {
            result.setCode("0");
            result.setMessage(" 更新状态失败");
        }
        return result;
    }


}


