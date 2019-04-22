package com.itdr.dao;


import com.itdr.pojo.UserInfo;

public interface UserDao {
   /* //数据层查询用户登录接口
    UserInfo selectByUnameAndPsd(String username, String password);*/
    //数据层查询用户是否存在接口
    int selectByUname(String username);
    //数据层查询用户问题接口
    UserInfo selectByUnameforquestion(String username);
    //数据层查询用户问题接口
    UserInfo selectByUnameforanswer(String username,String question);
}
