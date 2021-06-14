package com.vanilla.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vanilla.inventory.service.UserService;

@SpringBootApplication
public class InventoryApplication{

	
	public static void main(String[] args) {
	
		SpringApplication.run(InventoryApplication.class, args);
	
	}
 

}
