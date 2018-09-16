package com.musikouyi.jzframe.common.constant;

/**
 * 后台的REST请求资源定义
 * Author: YJZ
 * DateTime: 2018/9/16 0:25
 **/
public interface ControllerMapping {

    String BASE = "/";    //基本路径
    String ADMIN_BASE = "/admin";    //需要管理员权限路径

    String DO_LOGIN = "/doLogin";    //登录
    String DO_LOGOUT = "/doLogout";    //登出

    String TEST = ADMIN_BASE + "/test";
    String USER = ADMIN_BASE + "/user";
}