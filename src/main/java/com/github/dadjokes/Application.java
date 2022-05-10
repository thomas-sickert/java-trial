package com.github.dadjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {
		"com.github.dadjokes"
})
@EnableSwagger2
@EnableJpaRepositories(basePackages = "com.github.dadjokes")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
