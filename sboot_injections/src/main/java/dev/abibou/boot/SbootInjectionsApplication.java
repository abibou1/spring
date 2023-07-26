package dev.abibou.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.abibou.boot.beans.fieldInjection.Car;

@SpringBootApplication
public class SbootInjectionsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbootInjectionsApplication.class, args);
		
		Car car = (Car) context.getBean("car");
		
		car.startTrip();
		
		context.close();
	}

}
