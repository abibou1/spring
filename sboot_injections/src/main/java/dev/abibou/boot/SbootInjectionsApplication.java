package dev.abibou.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.abibou.boot.beans.fieldInjection.Car;
import dev.abibou.boot.beans.setterInjection.Bar;
import dev.abibou.boot.beans.constructorInjection.User;

@SpringBootApplication
public class SbootInjectionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbootInjectionsApplication.class, args);
		
		System.out.println("**** Field Injection ****");
		Car car = (Car) context.getBean("car");
		car.startTrip();
		
		System.out.println("**** Constructor Injection ****");
		User user = (User)context.getBean("user");
		user.checkUser();
		
		System.out.println("**** Setter Injection ****");
		Bar bar = (Bar)context.getBean("bar");
		System.out.println(bar);
		
		
		context.close();
	}

}
