package dev.abibou.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.abibou.boot.beans.Car;
import dev.abibou.boot.beans.Ticket;
import dev.abibou.boot.utils.PasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Line 16");
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println();
		
		
		Car car = (Car) context.getBean("car");
		car.startJourney();
		System.out.println();
		
		Ticket tkt = (Ticket)context.getBean(Ticket.class);
		System.out.println(tkt);
		
		 PasswordEncoder encoder = (PasswordEncoder) context.getBean("getEncoder");
		String myPwd = "LetmeIn$123";
		String encodedPwd = encoder.encodePassword(myPwd);
		System.out.println("encoded password = " + encodedPwd);
		System.out.println();
	}
}
