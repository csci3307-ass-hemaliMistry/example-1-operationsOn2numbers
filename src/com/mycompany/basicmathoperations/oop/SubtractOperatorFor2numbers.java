package com.mycompany.basicmathoperations.oop;

public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract {

	public SubtractOperatorFor2numbers(){
		//
	}
	
	public SubtractOperatorFor2numbers(float _number1, float number2) { 
	 		super(_number1,number2); 
		 		System.out.println("parent's number1 is " + super.number1); 
				System.out.println("_number1:" + _number1); 
		 		System.out.println("number2 :" + number2); 
		 	} 

	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	
	public float subtract2numbers() {
		return number1 - number2;
	}

}
