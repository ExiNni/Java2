package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {
		PersonSerial p = new PersonSerial("KH", 30);

		try {
			FileOutputStream fileout = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(p);
			out.close();
			fileout.close();
			System.out.println("Person 객체가 직렬화 되어 person.txt");
		} catch (Exception e) {

		}
		// 파일에서 객체를 역직렬화 하여 읽어옴
		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("person.txt 파일에서 객체를 역직렬화 하였습니다");
			System.out.println("역직렬화된 객체 정보: " + deSerialPerson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
