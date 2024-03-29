package com.thanhhnguyen23.microservices.springbootzuulgatewayproxystudentservice;

import com.thanhhnguyen23.microservices.springbootzuulgatewayproxystudentservice.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class SpringBootZuulgatewayproxyStudentServiceApplication {

    @RequestMapping(value="/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name){
		return "hello <strong style=\"color: red;\">" + name + "</strong> Responded on : " + new Date();
	}
	@RequestMapping(value="/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable(name = "name") String name){

    	return new Student(name, "Thanh", "MCA");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatewayproxyStudentServiceApplication.class, args);
	}

}
