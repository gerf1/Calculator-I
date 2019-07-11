package com.codingdojo;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator test1 = new Calculator(15.4,"+",3.2);
		Calculator test2 = new Calculator(66.9,"-",13.2);
		Calculator test3 = new Calculator(1001.32,"+",82.28);
		test1.performOperation();
		test2.performOperation();
		test3.performOperation();
		test1.getResults();
		test2.getResults();
		test3.getResults();
	}

}
