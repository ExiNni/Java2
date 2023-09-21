package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		
		String [] inturnArray = {"È«±æµ¿", "±èÃ¶¼ö" , "±è¸»¶Ë", "¹ÚÃ¶¼ö", "ÇãÇãÇã"};
		
		inturnArray [3] = "¹ÚÇÑ³ª";
		
		System.out.println("¹ÚÃ¶¼ö ¾¾ ´ë½Å¿¡ " + inturnArray[3] );
		
		String[] fruitArray = {"»ç°ú", "µþ±â", "Å°À§", "¸Þ·Ð", "±Ö"};
		fruitArray[0] = "¹Ù³ª³ª";
		fruitArray[1] = "¼ö¹Ú";
		fruitArray[2] = "·¹¸ó";
		fruitArray[3] = "±Ö";
		fruitArray[4] = "¿À·»Áö";
		
		for(int i = 0; i < fruitArray.length; i++) {
			System.out.println(fruitArray[i]);

		}
		
		
	}
}
