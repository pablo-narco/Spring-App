package ru.narco.spring.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
//	@Scheduled(fixedRate = 1000L)
//	public void start(){
//		System.out.println("New Rate" + new Date());
//
//	}
//
//	@Scheduled(fixedDelay = 1000L)
//	public void startDelayed(){
//		System.out.println("New Delay" + new Date());
//
//	}

	@Scheduled(cron = "* * * * * *")
	public void startDelayed(){
		System.out.println("New Delay" + new Date());

	}

}
