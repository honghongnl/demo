package com.lh.demo.common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CrossOriginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String origin = request.getHeader("Origin");
        String headers = request.getHeader("Headers");
        response.addHeader("Access-Control-Allow-Headers", headers);//允许自定义头
        response.addHeader("Access-Control-Allow-Origin", origin);//允许任意域的跨域
        response.addHeader("Access-Control-Allow-Methods", "GET,POST");//允许的跨域的方法
        response.addHeader("Access-Control-Max-Age", "33600");//预检命令的缓存时间
        response.addHeader("Access-Control-Allow-Credentials", "true");//允许带cookie的跨域请求
        filterChain.doFilter(servletRequest, response);
    }

    @Override
    public void destroy() {

    }
}
