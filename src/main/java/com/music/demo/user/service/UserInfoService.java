package com.music.demo.user.service;

import com.music.demo.dao.entity.jpa.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
