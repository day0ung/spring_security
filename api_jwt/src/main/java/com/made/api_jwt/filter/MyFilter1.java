package com.made.api_jwt.filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter1 implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter 1");
        chain.doFilter(request,response); // processing 할수 있게 chain return
    }
}
