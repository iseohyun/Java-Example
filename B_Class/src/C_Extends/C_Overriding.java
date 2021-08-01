package C_Extends;
class ParentOr {
    void display() {
    	System.out.println("부모 클래스의 display() 메소드입니다."); 
    }
}

class ChildOr extends ParentOr {
    void display() {
    	System.out.println("자식 클래스의 display() 메소드입니다.");
    }
}


public class C_Overriding {
	public static void main(String[] args) {
		ParentOr pa = new ParentOr();
		pa.display();
		ChildOr ch = new ChildOr();
		ch.display();
		ParentOr pc = new ChildOr();
		pc.display(); 
		// Child cp = new Parent();
    }
}