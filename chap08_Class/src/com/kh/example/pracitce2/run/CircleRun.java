package com.kh.example.pracitce2.run;

import com.kh.example.pracitce2.model.vo.Circle;

public class CircleRun {
	public static void main(String[] args) {
		Circle myCircle = new Circle(3.14, 5);
		
		myCircle.incrementRadius();
		myCircle.getAreaOfCircle();
		myCircle.getSizeOfCircle();
			
		
	}

}
