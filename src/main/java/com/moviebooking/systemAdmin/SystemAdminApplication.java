package com.moviebooking.systemAdmin;

import com.moviebooking.systemAdmin.city.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
public class SystemAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemAdminApplication.class, args);
		System.out.println("Running System Admin Service");

	}

}
