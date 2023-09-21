package chap36_finalSample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMain {

	public static void main(String[] args) {
		FileMain run = new FileMain();
		Food foodSample = new Food("사과", 20);
		run.fileSave("food.txt", foodSample);
	}

	public void fileSave(String filename, Food food) {
		// 전달 받은 fileName으로 파일 객체 생성
		try {
			FileOutputStream fOStream = new FileOutputStream(filename);
			// 파일 객체와 연결하는 파일 출력 스트림 생성
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream);

			// 파일에 food 객체를 기록
			objStream.writeObject(food);

			// 스트림을 닫음
			objStream.close();
			fOStream.close();

			System.out.println("Food 객체를 파일에 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}