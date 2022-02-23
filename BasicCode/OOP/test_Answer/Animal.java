package test_Answer;

public class Animal {
	private String name;
	private String voice = "ȣ����";
	
	protected Animal(String name){
		this.name = name;
	}
	
	protected void setVoice(String voice) {
		this.voice = voice;
	}
	
	protected String getVoice() {
		return voice;
	}
	
	public void crying() {
		System.out.println(name + "�� " + voice + "�ϰ� ��ϴ�.");
	}
	
	public String getName() {
		return name;
	}
}