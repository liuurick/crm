package com.liuurick.crm.settings.web.controller;

import com.liuurick.crm.settings.domain.User;
import com.liuurick.crm.settings.service.UserService;
import com.liuurick.crm.settings.service.impl.UserServiceImpl;
import com.liuurick.crm.utils.MD5Util;
import com.liuurick.crm.utils.PrintJson;
import com.liuurick.crm.utils.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liubin on 2020/11/20
 */
public class UserController extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getServletPath();
        if ("/settings/user/login.do".equals(path)){
            login(req,resp);
        }else if("/settings/user/xxx.do".equals(path)){
            //xxx(request,response);
        }
    }

    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("loginAct");
        String password = req.getParameter("loginPwd");
        String ip = req.getRemoteAddr();
        password = MD5Util.getMD5(password);

        //未来业务层开发，统一使用代理类形态的接口对象
        UserService userService = (UserService) ServiceFactory.getService(new UserServiceImpl());

        try {
            User user = userService.login(username, password, ip);
            //req.getSession().setAttribute("user",user);
            HttpSession session=req.getSession();
            session.setAttribute("user",user);
            /**session有效期设置的两种方式：
             *    1.代码设置：session.setMaxInactiveInterval(30);//单位：秒。30秒有效期，默认30分钟。
             *    2.web.xml中设置：
             *    <!-- 单位：分钟，默认就是30分钟。 -->
             *    <session-config>
             *        <session-timeout>30</session-timeout>
             *    </session-config>
             */
            System.out.println(session.getId());
            PrintJson.printJsonFlag(resp, true);

        }catch (Exception e){
            String msg = e.getMessage();
            /*

                我们现在作为contoller，需要为ajax请求提供多项信息

                可以有两种手段来处理：
                    （1）将多项信息打包成为map，将map解析为json串
                    （2）创建一个Vo
                            private boolean success;
                            private String msg;


                    如果对于展现的信息将来还会大量的使用，我们创建一个vo类，使用方便
                    如果对于展现的信息只有在这个需求中能够使用，我们使用map就可以了
             */
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("success", false);
            map.put("msg", msg);
            PrintJson.printJsonObj(resp, map);
        }
    }
}
