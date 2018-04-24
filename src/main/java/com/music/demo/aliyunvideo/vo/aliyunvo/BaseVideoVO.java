package com.music.demo.aliyunvideo.vo.aliyunvo;

public class BaseVideoVO {
    private String Format;

    private String Version;

    private String AccessKeyId;

    private String Signature;

    private String SignatureMethod;

    private String Timestamp;

    private String SignatureVersion;

    private String SignatureNonce;

    private String SecurityToken;

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getAccessKeyId() {
        return AccessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        AccessKeyId = accessKeyId;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getSignatureMethod() {
        return SignatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        SignatureMethod = signatureMethod;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    public String getSignatureVersion() {
        return SignatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        SignatureVersion = signatureVersion;
    }

    public String getSignatureNonce() {
        return SignatureNonce;
    }

    public void setSignatureNonce(String signatureNonce) {
        SignatureNonce = signatureNonce;
    }

    public String getSecurityToken() {
        return SecurityToken;
    }

    public void setSecurityToken(String securityToken) {
        SecurityToken = securityToken;
    }
}
