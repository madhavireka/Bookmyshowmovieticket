package com.bookmyshowproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*@EnableAspectJAutoProxy*/
@SpringBootApplication(/* exclude = { SecurityAutoConfiguration.class } */)
public class BookmyshowprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmyshowprojectApplication.class, args);
	}

}

