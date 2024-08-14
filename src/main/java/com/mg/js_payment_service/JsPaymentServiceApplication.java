package com.mg.js_payment_service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class JsPaymentServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws IOException, InterruptedException {
//		SpringApplication.run(JsPaymentServiceApplication.class, args);
//		vfTmp.generate("Test ");


		ConfigurableApplicationContext cap
				= new ClassPathXmlApplicationContext(
				"spring.xml");
		Thread.sleep(10000);
		// It will close the spring container
		// and as a result invokes the
		// destroy() method
		cap.close();
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JsPaymentServiceApplication.class);
	}
}
