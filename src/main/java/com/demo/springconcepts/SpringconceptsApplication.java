package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringconceptsApplication {
	public static final Logger logger= LoggerFactory.getLogger(SpringconceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts demo");
		ApplicationContext context=SpringApplication.run(SpringconceptsApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		logger.debug("Demo Bean="+demoBean.toString());
		EmployeeBean employeeBean= context.getBean(EmployeeBean.class);
		employeeBean.setEid(123);
		employeeBean.setEname("Spring Guru");
		employeeBean.showEmployeeDetails();
		

	}

}
