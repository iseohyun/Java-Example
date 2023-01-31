package test_Answer;

class Avatar {
  private String name;

  Avatar() {
    this("torr");
  }

  Avatar(String name) {
    this.name = name;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }
}

class newAvatar extends Avatar {
  protected String skill = "not yet";

  newAvatar() {
    setName(getName() + "(v2)");
  }

  newAvatar(String name) {
    super(name + "(v2)");
  }

  String action() {
    return skill;
  }
}

class allNewAvatar extends newAvatar {
  // String skill = "heal";
  String action() {
    return skill;
  }

  String action2() {
    return super.skill;
  }
}

public class Test01 {
  public static void main(String[] args) {
    // TODO : 여기에 코드를 입력하세요.
    allNewAvatar allMy = new allNewAvatar();
    newAvatar newMy = new newAvatar();

    allMy.skill = "1234567";
    newMy.skill = "aa";

    System.out.println(allMy.action());
    System.out.println(newMy.action());

  }
}