package com.itdr.controllers;

import com.itdr.common.ServerResponse;
import com.itdr.services.UserService;
import com.itdr.services.impl.UserServiceImpl;
import com.itdr.utils.UrlSetUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="UserServlet",value="/user/*")    /*users前面的 (/)是代表的是(../shopping/) */
public class UserServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = UrlSetUtils.getMethod(request);
        //比较是否存在这样的请求方法
        switch (method){
            /*case "login":
                login(request,response);
                break;*/
            case "forget_get_question":
                forget_get_question(request,response);
                break;
            case "forget_check_answer":
                forget_check_answer(request,response);
                break;
            default :
        }
    }
      //注入业务层
    UserService us =new UserServiceImpl();

   /* //用户登录函数
    private  void login(HttpServletRequest request, HttpServletResponse response){
        ServerResponse sr=null;
        //获取前台传来的用户参数
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        //获取session对象，用于创建用户session
        HttpSession session=request.getSession();
        //业务层处理业务
        sr=us.login(session,username,password);
        //数据转化为json数据格式
        UrlSetUtils.BackToJson(sr, response);
    }
*/
   //忘记密码函数
   private  void forget_get_question(HttpServletRequest request, HttpServletResponse response){
       ServerResponse sr=null;
       //获取前台传来的用户参数
       String username=request.getParameter("username");
       //获取session对象，用于创建用户session
       //无
       //业务层处理业务
       sr=us.forget_get_question(username);
       //数据转化为json数据格式
       UrlSetUtils.BackToJson(sr, response);
   }

   //提交问题答案函数
    private  void forget_check_answer(HttpServletRequest request, HttpServletResponse response){
        ServerResponse sr=null;
        //获取前台传来的用户参数
        String username=request.getParameter("username");
        String question=request.getParameter("question");
        String answer=request.getParameter("answer");
        //获取session对象，用于创建用户session
        //无
        //业务层处理业务
        sr=us.forget_check_answer(username,question,answer);
        //数据转化为json数据格式
        UrlSetUtils.BackToJson(sr, response);
    }
}
