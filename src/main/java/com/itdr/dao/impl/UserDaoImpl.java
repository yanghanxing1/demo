package com.itdr.dao.impl;

import com.itdr.dao.UserDao;
import com.itdr.pojo.UserInfo;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
/*
    @Override
    public UserInfo selectByUnameAndPsd(String username, String password) {
        QueryRunner qr =new QueryRunner(new ComboPooledDataSource());
        String sql="select * from neuedu_user where username=? and password=?";
        UserInfo ui=null;
        try {
           ui = qr.query(sql,new BeanHandler<UserInfo>(UserInfo.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ui;
    }
*/

    @Override
    public int selectByUname(String username) {
        QueryRunner qr =new QueryRunner(new ComboPooledDataSource());
        String sql="select username from neuedu_user where username=?";
       int a =0;
        try {
           UserInfo u = qr.query(sql,new BeanHandler<UserInfo>(UserInfo.class),username);
           if(u!=null){
               a=1;
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public UserInfo selectByUnameforquestion(String username) {
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        String sql = "select question from neuedu_user where username=?";
        UserInfo ui = null;
        try {
            ui = qr.query(sql, new BeanHandler<UserInfo>(UserInfo.class), username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ui;
    }

    @Override
    public UserInfo selectByUnameforanswer(String username,String question) {
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        String sql = "select * from neuedu_user where  username=? and question=?";
        UserInfo ui = null;
        try {
            ui = qr.query(sql, new BeanHandler<UserInfo>(UserInfo.class), username,question);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ui;
    }
}
