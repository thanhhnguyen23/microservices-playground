package com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {

    @Override
    /**
     * typically pre, post, or route filter
     */
    public String filterType() {
        return "pre";
    }

    /**
     * gives the order in which this filter will be executed, relative to other filters
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * logic that determines when to execute this filter
     * (this particular filter will always be executed)
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run() contains the functionality of the filter
     */
    @Override
    public Object run(){
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        return null;
    }

}
