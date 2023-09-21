package chap36_finalSample;

public class Music {
	private String emotion;
	private String name;

	public Music(String name, String emotion) {
		this.name = name;
		this.emotion = emotion;
	}

	public String getName() {
		return name;
	}

	public String getEmotion() {
		return emotion;
	}
}
