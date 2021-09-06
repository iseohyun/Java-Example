package Command;

/**
 * 
 * @author Seohyun Jung
 *
 *		커멘드(명령) 패턴 : 지시자(command) -> 감독관/발동자(invoker) -> 노예/수신자(receiver) (+명령)의 4박자로 이루어집니다.
 *			노예가 수행 가능한 명령어를 모든 개체가 공유되어야하는 특징이 있습니다.
 *			초기설정에서 감독관에게 노예가 수행가능한 명령어를 입력시키면, 노예를 직접 대면하지 않아도 명령을 수행가능하게 할 수있습니다.
 *
 *			노예를 업데이트 시킬 수 없는 상황인 경우, 또는 명령을 기억해서 수행하거나, 또는 명령을 기억해두어야 할 때 유용하게 써먹을 수 있습니다.
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

// 명령을 수행할 개체
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