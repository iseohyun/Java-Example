package C_Lambda;

public class C_HowToReduce {
	public static void main(String [] args) {
		Movable movable = new Movable() {
		    @Override
		    public void move(String str) {
		        System.out.println("gogo move move" + str);
		    }
		};

		Movable movable2 = (str) -> System.out.println("gogo move move" + str);
	}
}
interface Movable{
	void move(String str);
}

class Car implements Movable{
    @Override
    public void move(String str) {
        System.out.println("gogo car move" + str);
    }
}