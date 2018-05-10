package com.music.demo.aliyunvideo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.music.demo.aliyunvideo.Utils.AliyunVideoUtils;
import com.music.demo.aliyunvideo.vo.aliyunvo.BaseVideoVO;
import com.music.demo.aliyunvideo.vo.aliyunvo.CreateUploadVideoVo;
import com.music.demo.dao.entity.mybatis.ProductDetail;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import static com.music.demo.aliyunvideo.Utils.AliyunVideoUtils.generateRandom;
import static com.music.demo.aliyunvideo.Utils.AliyunVideoUtils.generateTimestamp;

@Service
public class ALiYunService {

    public String getAliVideo(BaseVideoVO vo) throws Exception {
        String returnStr = AliyunVideoUtils.getAliyunVideoReturn(getBaseVO(), vo);
        return returnStr;
    }


    private BaseVideoVO getBaseVO() {
        BaseVideoVO baseVideoVO = new BaseVideoVO();
        baseVideoVO.setFormat("json");
        baseVideoVO.setVersion("2017-03-21");
        baseVideoVO.setAccessKeyId("LTAI7C6TrjDTmpie");
        baseVideoVO.setSignatureMethod("Hmac-SHA1");
        baseVideoVO.setTimestamp(generateTimestamp());
        baseVideoVO.setSignatureVersion("1.0");
        baseVideoVO.setSignatureNonce(generateRandom());
        return baseVideoVO;
    }

    public ProductDetail getSaveProductDetail(List<ProductDetail> list, String returnStr, CreateUploadVideoVo createUploadVideoVo) {
        String tCourseDetailId = "001";
        if (list.size() != 0) {
            int maxId = Integer.parseInt(list.get(0).getCourseDetailId().substring(10, 13)) + 1;
            DecimalFormat df = new DecimalFormat("000");
            tCourseDetailId = df.format(maxId);
        }
        String courseId = createUploadVideoVo.getCourseId() + tCourseDetailId;
        JSONObject jsonObject = (JSONObject) JSON.parse(returnStr);
        String videoId = (String) jsonObject.get("VideoId");
        ProductDetail productDetail = new ProductDetail();
        productDetail.setCourseDetailAiliId(videoId);
        productDetail.setCourseDetailId(courseId);
        productDetail.setCourseTitle(createUploadVideoVo.getTitle());
        productDetail.setCourseTime(createUploadVideoVo.getTime());
        productDetail.setId(courseId);
        productDetail.setCourseUploadTime(new Date());;
        productDetail.setCourseFlag("0");
        return productDetail;
    }

}