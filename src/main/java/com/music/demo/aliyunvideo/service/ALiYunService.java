package com.music.demo.aliyunvideo.service;

import com.music.demo.aliyunvideo.Utils.AliyunVideoUtils;
import com.music.demo.aliyunvideo.vo.aliyunvo.BaseVideoVO;
import org.springframework.stereotype.Service;

import static com.music.demo.aliyunvideo.Utils.AliyunVideoUtils.generateRandom;
import static com.music.demo.aliyunvideo.Utils.AliyunVideoUtils.generateTimestamp;

@Service
public class ALiYunService {

    public String getAliVideo(BaseVideoVO vo) {
        String returnStr = AliyunVideoUtils.getAliyunVideoReturn(getBaseVO(),vo);

        return returnStr;
    }


 private BaseVideoVO getBaseVO(){
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
}