package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*
			3. 증감연산자(Increment & Decrement)
			   증감연산자는 변수의 갑을 1씩 증가시키거나 감소 시킬때 사용한다.
			   전위 증감 연산자(++a, --a)
			   	1-1) 전위 증감 연산자
			   			++ 항의 값에 1을 더한다.
			   			val = ++num;	// num의 값이 1 증가한 후 val 변수에 대입
			   			val = --num;	// num의 값이 1 감소한 후 val 변수에 대입
			   
			   후위 증감 연산자(a++, a--)
			   	1-2) 후위 증감 연산자			   
			
		*/
		
		int val, val2;
		int num1 = 10;
		val = ++num1; 

		System.out.println(val);	// num의 값이 1 증가한 후 val 변수에 대입을 하기 때문에 11이 대입됨
		
		val2 = --num1;
		System.out.println(val2);	// 11이 된 num의 값이 1 감소한 후 val2 변수에 대입을 하기 때문에 10이 대입됨
		
		int val3, val4;
		int num2 = 10;
		
		System.out.println("num2의 값 : " + num2);
		val3 = num2++;	// val3 변수에 기존 num2 값을 대입한 후 num2 값이 1증가함
		System.out.println("val3: " + val3);
		System.out.println("num2의 값: " + num2);
		
		val4 = num2--;
		System.out.println("val4: " + val4);
		System.out.println("num2의 값: " + num2);
		
		
					
	}

}
