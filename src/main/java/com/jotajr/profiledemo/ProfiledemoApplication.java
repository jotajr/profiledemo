package com.jotajr.profiledemo;

import com.jotajr.profiledemo.service.ServiceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfiledemoApplication implements CommandLineRunner {

	final ServiceExample serviceExample;

	public ProfiledemoApplication(ServiceExample serviceExample) {
		this.serviceExample = serviceExample;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProfiledemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inicio da aplicacao");
		serviceExample.doSrvice();
	}
}
