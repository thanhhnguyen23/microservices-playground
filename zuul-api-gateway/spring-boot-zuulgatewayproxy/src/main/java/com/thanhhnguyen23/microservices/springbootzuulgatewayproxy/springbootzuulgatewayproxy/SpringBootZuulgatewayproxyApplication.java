package com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy;

import com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy.filters.ErrorFilter;
import com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy.filters.PostFilter;
import com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy.filters.PreFilter;
import com.thanhhnguyen23.microservices.springbootzuulgatewayproxy.springbootzuulgatewayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class SpringBootZuulgatewayproxyApplication {

	/**
	 * registering zuul filters
	 */
	@Bean
	public PreFilter preFilter(){
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter(){
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}

	/**
	 * route configurations for zuul
	 */
	@Bean
	public RouteFilter routeFilter(){
		return new RouteFilter();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatewayproxyApplication.class, args);
	}

}
