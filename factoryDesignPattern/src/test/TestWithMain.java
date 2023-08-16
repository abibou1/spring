package test;
import factoryPattern.CustomeWrapperDriver;

public class TestWithMain {

	public static void main(String[] args) {
		
		CustomeWrapperDriver wrapperDriver = new CustomeWrapperDriver();
		
		wrapperDriver.getMyWrapperInstance("50").printType();
		wrapperDriver.getMyWrapperInstance("false").printType();
		wrapperDriver.getMyWrapperInstance("3.142").printType();
		wrapperDriver.getMyWrapperInstance("a").printType();
		wrapperDriver.getMyWrapperInstance("1000L").printType();

	}

}
