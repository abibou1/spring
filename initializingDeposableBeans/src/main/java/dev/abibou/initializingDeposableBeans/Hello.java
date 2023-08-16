package dev.abibou.initializingDeposableBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() {
		System.out.println("I am the afterPropertiesSet method and I work after bean instantiation.");
	}
	
	public void destroy() {
		System.out.println("I am the detroy method and I work just before bean destroyed");
	}
	
	public void sayHello() {
		System.out.println("Hello, Welcome!");
	}
}
