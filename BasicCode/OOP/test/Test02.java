package test;


public class Test02 {
  public static void main(String[] args) {
    // TODO : 여기에 코드를 입력하세요.
  }
}

/////////////////////////// import
//
//따라하기 1-1 : Dog 클래스를 생성하고, Animal을 상속받습니다.
//			-> Animal은 Answer패키지에 포함되어 있습니다.
//
//따라하기 1-2 : 붉은 밑줄이 되어있는 곳의 가장 오른쪽으로 커서를 옮기고
//ctrl + alt를 눌러 자동으로 import Answer.Animal이 추가되도록 합니다.
//
//따라하기 1-3 : 생성자는 String name과 String voice를 인자로 갖습니다.
//super(), setVoice() 메소드를 이용합니다.
//
//따라하기 1-4 : Dog인스턴스 bulldog를 생성합니다. new Dog("불독", "컹컹");
//
//따라하기 1-5 : bulldog.crying(); 을 실행합니다.


/////////////////////////// protected vs default 비교하기
//
//따라하기 2-1 : setVoice() 메소드의 Protected를 삭제하고 실행해봅니다.


/////////////////////////// Override
//
//따라하기 3-1 : crying() 메소드의 Override합니다.
//-> 불독이 컹컹하고 짖습니다.


/////////////////////////// interface 생성하기
//
//따라하기 4-1 : Animal을 상속 받은 Birds 클래스를 생성합니다.
//
//따라하기 4-2 : interface flyable을 생성합니다.
//default의 메서드 2개를 생성합니다.
//-> flying(...)은 "...이 날아갑니다."를 출력합니다.
//-> landing(...)은 "...이 착지합니다."를 출력합니다.
//
//따라하기 4-3 : Birds가 flyable을 implements 합니다.
//
//따라하기 4-4 : Birds클래스로 chicken을 생성합니다. 아래와 같이 main에서 호출합니다.
//chicken.flying(chicken.getName());
//chicken.landing(chicken.getName());

/////////////////////////// default vs. abstract
//
//따라하기 5-1 : interface runalbe을 생성합니다.
//
//따라하기 5-2 : running(...)은 "...이 달립니다." 를 출력합니다.
//
//따라하기 5-3 : stop은 abstract로 만듭니다.
//
//따라하기 5-4 : Dog에 runable을 상속합니다.
//Bird에도 runalbe을 상속(추가)합니다.
//
//따라하기 5-5 : 추상메소드는 재정의 해야합니다.
//빨간색 밑줄 가장 오른쪽에서 ctrl+space를 눌러 코드를 추가합니다.
//
//따라하기 5-6 : 추가된 함수를 main에서 호출합니다.
//chicken.running(chicken.getName());
//chicken.stop();

/////////////////////////// static
//
//따라하기 6-1 : runable에 sprint 메서드를 static형태로 추가합니다.
//-> System.out.println(name + "이 전력질주를 합니다.");
//
//따라하기 6-2 : main에서 sprint()를 이용하여 
//-> "표범이 전력질주를 합니다."를 출력해봅니다.



