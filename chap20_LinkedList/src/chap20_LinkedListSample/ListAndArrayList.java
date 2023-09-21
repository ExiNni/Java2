package chap20_LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("첫 번쨰");
		linkedList.add("두 번쨰");
		linkedList.add("세 번쨰");
		
		System.out.println("linkedList: " + linkedList);
		
		// 요소 삭제
		linkedList.remove(2);
		System.out.println("삭제 후" + linkedList);
		
		//요소 검색
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번쨰 요소 포함 여부: " + isTrue);
		
		// 요소 개수
		int size = linkedList.size();
		System.out.println("크기: " + size);

	}

}
