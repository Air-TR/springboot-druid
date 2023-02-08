package com.tr.springboot.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动后访问 http://127.0.0.1:8095/druid
 */
@SpringBootApplication
public class SpringbootDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDruidApplication.class, args);
	}

}
