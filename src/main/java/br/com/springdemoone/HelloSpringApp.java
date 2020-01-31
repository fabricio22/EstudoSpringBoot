package br.com.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// Primeiro, carrego o arquivo applicationContext.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Segundo, recupero o bean do spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		// Terceiro, chamar o método bean
		System.out.println(coach.getDailyWorkout());
		
		// Quarto, fechar o contexto
		context.close();
	}
}
