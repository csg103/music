package com.music.demo.aliyunvideo.vo.aliyunvo;

public class CreateUploadVideoVo extends BaseVideoVO {
    private String Action;
    private String Title;
    private String FileName;
    private String FileSize;
    private String Description;
    private String CoverURL;
    private String CateId;
    private String Tags;

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String fileSize) {
        FileSize = fileSize;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCoverURL() {
        return CoverURL;
    }

    public void setCoverURL(String coverURL) {
        CoverURL = coverURL;
    }

    public String getCateId() {
        return CateId;
    }

    public void setCateId(String cateId) {
        CateId = cateId;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getTemplateGroupId() {
        return TemplateGroupId;
    }

    public void setTemplateGroupId(String templateGroupId) {
        TemplateGroupId = templateGroupId;
    }

    private String TemplateGroupId;

}
