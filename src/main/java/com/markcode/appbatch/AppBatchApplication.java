package com.markcode.appbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBatchApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppBatchApplication.class, args);
		System.exit(SpringApplication.exit(SpringApplication.run(AppBatchApplication.class, args)));
	}

}
