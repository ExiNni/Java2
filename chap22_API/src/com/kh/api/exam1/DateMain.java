package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
	/*
		Date : 날짜와 시간 정보를 나타내는데 사용
			   java1.1 이후 권장되지 않음
			   	java.time 패키지에서 LocalDate 혹은 LocalTime LocalDateTime
	*/
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("현재 날짜 시간: "+ current);
		
		// 날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate future = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + future);
		
		// minus plus 이용해서 각 2개씩 만들어보기 총 4개
		LocalDate past1 = today.minusDays(100);
		System.out.println("100일전 날짜 : " + past1);
		LocalDate future1 = today.plusDays(100);
		System.out.println("100일 후 날짜 : " + future1);
		LocalDate past2 = today.minusDays(200);
		System.out.println("200일전 날짜 : " + past2);
		LocalDate future2 = today.plusDays(200);
		System.out.println("200일 후 날짜 : " + future2);
		
		LocalDate date1 = LocalDate.of(2023, 8, 13);
		LocalDate date2 = LocalDate.of(2022, 9, 13);
		
		if(date1.isBefore(date2)) {
			System.out.println("더 이전입니다");
		}else if(date1.isAfter(date2)){
			System.out.println("더 이후 입니다.");
		
		}else {
			System.out.println("날짜가 같습니다.");
		}
				
	}
}
