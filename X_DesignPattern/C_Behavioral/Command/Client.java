package Command;

/**
 * 
 * @author Seohyun Jung
 *
 *		Ŀ���(���) ���� : ������(command) -> ������/�ߵ���(invoker) -> �뿹/������(receiver) (+���)�� 4���ڷ� �̷�����ϴ�.
 *			�뿹�� ���� ������ ��ɾ ��� ��ü�� �����Ǿ���ϴ� Ư¡�� �ֽ��ϴ�.
 *			�ʱ⼳������ ���������� �뿹�� ���డ���� ��ɾ �Է½�Ű��, �뿹�� ���� ������� �ʾƵ� ����� ���డ���ϰ� �� ���ֽ��ϴ�.
 *
 *			�뿹�� ������Ʈ ��ų �� ���� ��Ȳ�� ���, �Ǵ� ����� ����ؼ� �����ϰų�, �Ǵ� ����� ����صξ�� �� �� �����ϰ� ����� �� �ֽ��ϴ�.
 *
 */

public class Client{
	public static void main(String[] args){
		Receiver r = new Receiver();
		Command cmd1 = new Cmd1(r);
		Command cmd2 = new Cmd2(r);
	
		Invoker s = new Invoker(cmd1, cmd2);
	
		s.doIt1();
		s.doIt2();
	}
}

class Invoker {
	private Command[] cmd = new Command[2];

	public Invoker(Command c1, Command c2){
		cmd[0] = c1;
		cmd[1] = c2;
	}

	public void doIt1(){
		cmd[0].execute();
	}

	public void doIt2(){
		cmd[1].execute();
	}
}

// ����� ������ ��ü
class Receiver{
	public void cmd1(){
		System.out.println("Command 1 Received.");
	}

	public void cmd2(){
		System.out.println("Command 2 Received.");
	}
}

interface Command{
	void execute();
}

class Cmd1 implements Command{
	private Receiver robot;

	public Cmd1(Receiver robot)	{
		this.robot = robot;
	}
	
	public void execute() {
		robot.cmd1();
	}
}

class Cmd2 implements Command{
	private Receiver robot;
	
	public Cmd2(Receiver robot)	{
		this.robot = robot;
	}
	
	public void execute() {
		robot.cmd2();
	}
}