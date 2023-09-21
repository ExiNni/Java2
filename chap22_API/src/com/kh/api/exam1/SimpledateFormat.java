package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
	SimpleDateFormat
		날짜와 시간을 원하는 형식으로  포멧팅 하거나
		문자열로부터 날짜와 시간을 파싱하는데 사용되는 클래스
*/
public class SimpledateFormat {

	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String forDate = sdf.format(currentDate);
		
		// 결과 출력
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);
	}
}
