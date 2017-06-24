package com.org.sairam.calculator;

public class Calculator {

	public void addition(int number1, int number2) {
		int result = number1+number2;
		System.out.println("The Sum of "+number1+" and "+number2 +" is "+result);
	}

	public void difference(int number1, int number2) {
		int difference = number1 - number2;
		System.out.println("The difference of "+number1+" and "+number2+" is : "+difference);
	}
	
	public void multiply(int number1, int number2) {
		int multiply = number1*number2;
		
		System.out.println("The Mulitplication of "+number1+" and "+number2+" is : "+multiply);
	}
	
	public static void main(String args[]) {
		Calculator calc = new Calculator();
		int number1 = 50;
		int number2 = 20;
		
		calc.addition(number1, number2);
		calc.difference(number1, number2);
		calc.multiply(number1, number2);
	}
	
}
