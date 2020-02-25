package com.stx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CharacterEncodingFilter")
public class CharacterEncodingFilter extends Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("过滤器执行前");
        chain.doFilter(req, resp);//让程序继续执行，否则将不会执行
        System.out.println("过滤器执行后");
    }

    public void destroy() {
        System.out.println("过滤器销毁");
    }


}
