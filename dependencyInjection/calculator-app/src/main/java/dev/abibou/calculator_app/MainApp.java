package dev.abibou.calculator_app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.abibou.calculator_app.beans.arithmeticoperations.BasicArithmeticOperations;


public class MainApp 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Spring basicArithmeticOperations app runs!");
		
		BasicArithmeticOperations f = context.getBean("basicArithmeticOperations", BasicArithmeticOperations.class);
		System.out.println(f.toString());
		System.out.println(f.add());
		System.out.println(f.subtract());
		System.out.println(f.multiply());
		System.out.println(f.divide());
		
//		Bar b = context.getBean("bar", Bar.class);
//		System.out.println(b);
		
		context.close();
    }
}
