package com.myweb.filter;

import com.myweb.dao.UserDao;
import com.myweb.daoImpl.UserDaoImpl;
import com.myweb.domain.UserBean;
import com.myweb.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter(filterName = "AutoLoginFilter",urlPatterns = "/*")
public class AutoLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws
            ServletException, IOException {
        try {
            HttpServletRequest request = (HttpServletRequest) req;
            //先判断session是否有userbean，直接放行
            UserBean userBean= (UserBean) request.getSession().getAttribute("userBean");
            //判断非空，放行
            if(userBean != null){
                System.out.println("---有session---");
                chain.doFilter(request, resp);
            }else{
                System.out.println("---无session,自动登陆---");
                //session失效，找cookie
                //从请求中获取cookie，找到对应key 的cookie
                Cookie[] cookies = request.getCookies();
                //找出浏览器里的cookie
                Cookie cookie = CookieUtil.findCookie(cookies, "auto_login");
                //判断cookie非空，表示不是第一次登陆
                if(cookie == null){
                    //第一次登陆，放行
                    System.out.println("第一次。。。");
                    chain.doFilter(request, resp);

                }else {
                    System.out.println("找cookie...");
                    //不是第一次登陆
                    //获得cookie中value
                    String value = cookie.getValue();
                    //分割出username，password
                    String userName = value.split("#")[0];
                    String password = value.split("#")[1];
                    System.out.println(userName+"=="+password);
                    UserBean user = new UserBean(userName,password);
                    UserDao dao = new UserDaoImpl();
                    userBean = dao.login(user);
                    //    存session
                    request.getSession().setAttribute("userBean", userBean);
                    //放行
                    chain.doFilter(request, resp);
                    System.out.println("有cookie放行");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
