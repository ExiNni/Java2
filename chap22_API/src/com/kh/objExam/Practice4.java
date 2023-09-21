package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	public static void main(String[] args) {

		Practice4 run = new Practice4();
		run.practice1();
		run.practice2();
		run.practice3();
		run.practice4();
		run.practice5();

	}

	public void practice1() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);
	}

	public void practice2() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);

	}

	public void practice3() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);

	}

	public void practice4() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy HH");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);

	}

	public void practice5() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-EE");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜 및 시간: " + forDate);

	}

}
