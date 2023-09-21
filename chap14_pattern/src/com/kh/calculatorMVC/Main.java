package com.kh.calculatorMVC;

public class Main {
	public static void main(String[] args) {
		// model view controller
		CalculatorModel cltM = new CalculatorModel();
		CalculatorView cltV = new CalculatorView();
		CalculatorController cltC = new CalculatorController(cltM, cltV);
		
		cltC.run();
	}

}
