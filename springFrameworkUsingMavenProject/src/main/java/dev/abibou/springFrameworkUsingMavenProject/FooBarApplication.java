package dev.abibou.springFrameworkUsingMavenProject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooBarApplication {
	
	
	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Spring foobar app runs!");
		
		Foo f = context.getBean("foo", Foo.class);
		System.out.println(f);
		
		Bar b = context.getBean("bar", Bar.class);
		System.out.println(b);
		
		context.close();
		
	}

}
