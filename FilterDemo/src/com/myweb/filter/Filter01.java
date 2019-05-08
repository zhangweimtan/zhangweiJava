package com.myweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter01", urlPatterns = "/*")
public class Filter01 implements Filter {
    public void destroy() {
        System.out.println("过滤器销毁。。");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤器1来了。。。");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器创建。。。");
    }

}
