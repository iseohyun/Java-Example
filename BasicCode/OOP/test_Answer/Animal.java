package test_Answer;

public class Animal {
  private String name;
  private String voice = "호에엥";

  protected Animal(String name) {
    this.name = name;
  }

  protected void setVoice(String voice) {
    this.voice = voice;
  }

  protected String getVoice() {
    return voice;
  }

  public void crying() {
    System.out.println(name + "이 " + voice + "하고 웁니다.");
  }

  public String getName() {
    return name;
  }
}