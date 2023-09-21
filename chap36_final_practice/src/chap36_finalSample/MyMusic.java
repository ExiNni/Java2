package chap36_finalSample;

import java.util.ArrayList;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("¹ß¶óµå", "½½ÇÄ"));
		list.add(new Music("´í½º", "½Å³²"));
		// list.add(new Music("À½¾Ç", "À½¾Ç"));
		
		for(int i = 0; i < list.size(); i ++) {
			Music m = list.get(i);
			System.out.println(m.getName() + ", " + m.getEmotion());
		}

	}
	public static void main(String[] args) {
		MyMusic run = new MyMusic();
		run.runFruit();
	}
}
