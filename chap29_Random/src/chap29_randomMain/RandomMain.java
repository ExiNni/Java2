package chap29_randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
	Random : 난수를 생성하기 위해 사용되는 클래스
	난수 : 무작위로 만들어진 수
*/
public class RandomMain {

	public static void main(String[] args) {
		RandomMain run = new RandomMain();
		run.Lotto();
	}
	
	public void Lotto() {
		Random rd = new Random(); // 랜덤 객체 생성
		// 1 ~ 45 범위 지정해서 난수 생성
		// ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>(); 
		// 중복을 피하기 위해 set을 사용 할 수 있음
		// 숫자 6개만 들어갈 것
		while(lottoNum.size() < 6) {
			int ranNum = rd.nextInt(45) + 1; // 0 ~ 44  자리의 랜덤으로 번호 하나
			
			// 존재하는지 여부 확인, 중복 X
			if(!lottoNum.contains(ranNum)) {
				lottoNum.add(ranNum);

			}
		}
		System.out.println("로또 번호 : " + lottoNum);
	}

	public void RandomExam() {
		// 로또 번호 생성기
		Random rd = new Random(); // 랜덤 객체 생성

		// 1. 정수 범위 내에서 랜덤인 난수를 만들어야 함
		int ranInt = rd.nextInt(100); // 0 ~ 99 사이에서 숫자 하나 발생
		System.out.println(ranInt);

		// 2. 실수 범위 내에서 랜덤인 난수를 만들어야 함
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0

	}
}
