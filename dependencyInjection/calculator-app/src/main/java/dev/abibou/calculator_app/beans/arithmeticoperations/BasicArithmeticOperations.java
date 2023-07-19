package dev.abibou.calculator_app.beans.arithmeticoperations;

public class BasicArithmeticOperations {
	private double num1;
	private double num2;
	
	public BasicArithmeticOperations(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public double add() {
		return num1+num2;
	}
	
	public double subtract() {
		return num1-num2;
	}
	
	public double multiply() {
		return num1*num2;
	}
	
	public double divide() {
		
		try {
			return num1/num2;
		} catch(ArithmeticException e) {
			throw new ArithmeticException("dividing" + num1+"and "+ num2+ " is not allowed");
		}
	}

	@Override
	public String toString() {
		return "BasicArithmeticOperations [num1=" + num1 + ", num2=" + num2 + "]";
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
}
