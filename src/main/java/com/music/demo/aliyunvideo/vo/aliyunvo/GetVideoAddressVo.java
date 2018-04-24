package com.music.demo.aliyunvideo.vo.aliyunvo;

public class GetVideoAddressVo extends BaseVideoVO {
    //操作接口名，系统规定参数，取值： GetPlayInfo
    private String Action;
    //视频ID
    private String VideoId;
    //	视频流格式，多个用逗号分隔，支持格式mp4,m3u8,mp3，默认获取所有格式的流
    private String Formats;
    //播放地址过期时间，默认为3600秒，支持设置最小值为3600秒（当指定时间小于3600秒时，设置为默认3600秒）。只有开启了URL鉴权才会生效。
    private String AuthTimeout;
    //视频流类型，多个用逗号分隔，支持类型video,audio，默认获取所有类型的流
    private String StreamType;
    //视频流清晰度，多个用逗号分隔，取值FD(流畅)，LD(标清)，SD(高清)，HD(超清)，OD(原画)，2K(2K)，4K(4K)，默认获取所有清晰度的流
    private String Definition;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getVideoId() {
        return VideoId;
    }

    public void setVideoId(String videoId) {
        VideoId = videoId;
    }

    public String getFormats() {
        return Formats;
    }

    public void setFormats(String formats) {
        Formats = formats;
    }

    public String getAuthTimeout() {
        return AuthTimeout;
    }

    public void setAuthTimeout(String authTimeout) {
        AuthTimeout = authTimeout;
    }

    public String getStreamType() {
        return StreamType;
    }

    public void setStreamType(String streamType) {
        StreamType = streamType;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String definition) {
        Definition = definition;
    }
}
