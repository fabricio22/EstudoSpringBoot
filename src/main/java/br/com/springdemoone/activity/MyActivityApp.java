package br.com.springdemoone.activity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.springdemoone.Coach;

public class MyActivityApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("newCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
	}
}
