package dev.abibou.initializingDeposableBeans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{	
    public static void main( String[] args )
    {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
	    	Hello hello = (Hello)context.getBean("hello");
	    	
	    	 hello.sayHello();
	    	
	    	context.close();
    }
}
