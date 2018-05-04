package com.music.demo.aliyunvideo.controller;


import com.music.demo.aliyunvideo.service.ALiYunService;
import com.music.demo.aliyunvideo.vo.aliyunvo.BaseVideoVO;
import com.music.demo.aliyunvideo.vo.aliyunvo.CreateUploadVideoVo;
import com.music.demo.aliyunvideo.vo.aliyunvo.GetVideoAddressVo;
import com.music.demo.aliyunvideo.vo.returnvo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class ALiYunVideoController {

    @Autowired
    ALiYunService consumerService;



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
        createUploadVideoVo.setAction("CreateUploadVideo");
        createUploadVideoVo.setCateId("71209652");
        createUploadVideoVo.setTemplateGroupId("613c013504c0bb350eefffd2ae49b017");
        String returnStr = consumerService.getAliVideo(createUploadVideoVo);

        //保存将要上传的视频ID

        AjaxResult result = new AjaxResult();
        result.setData(returnStr);
        return result;
    }

    @RequestMapping("/getPlayAuth")
    @ResponseBody
    public AjaxResult getPlayAuth(HashMap<String, Object> map) {

        GetVideoAddressVo getVideoAddressVo = new GetVideoAddressVo();
        getVideoAddressVo.setAction("GetPlayInfo");
        getVideoAddressVo.setVideoId("97b82913bd8346f087a6b5eed2820757");
        getVideoAddressVo.setFormats("HLS");
        getVideoAddressVo.setAuthTimeout("3600");
//            getVideoAddressVo.setStreamType("");
//            getVideoAddressVo.setDefinition("");


        String returnStr = consumerService.getAliVideo(getVideoAddressVo);

        AjaxResult result = new AjaxResult();
        result.setData(returnStr);
        return result;
//            return null;
    }


    @RequestMapping("/play")
    public String play(HashMap<String, Object> map) {
//           String playAuth = AliyunVideoUtils.  getPlayAuth("97b82913bd8346f087a6b5eed2820757");
//            map.put("playAuth", playAuth);
        return "/play";
    }


}


