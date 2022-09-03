package com.example.SchedulingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingApplication.class, args);
		SchedulingTasks sh=new SchedulingTasks();
		sh.scheduleTaskWithFixedRate();
		sh.scheduleTaskWithCronExpression();
		sh.scheduleTaskWithFixedDelay();
		sh.scheduleTaskWithInitialDelay();
	}

}
