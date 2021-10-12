package chainOfResp;
/**
 * 	출처 : https://ko.wikipedia.org/wiki/%EC%B1%85%EC%9E%84_%EC%97%B0%EC%87%84_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		책임 연쇄 패턴 : 연쇄적으로 처리해야 할 때, 구조화한 경우를 이야기 합니다.
 *
 *		코드해석)
 *			1> Logger <- Stdout.., Email.., Stderr..
 *
 *			2> DEBUG(3) -> NOTICE(5) -> ERR(7)
 *	
 *			3>	("명령어1", 3) -> DEBUG  
 *				("명령어2", 5) -> DEBUG -> NOTICE
 *				("명령어3", 7) -> DEBUG -> NOTICE -> ERR
 *
 */

public class Client {
	public static void main(String[] args) {
		Logger logger1, logger2;
		logger1 = logger2 = new StdoutLogger(Logger.DEBUG);
		logger2 = logger2.setNext(new EmailLogger(Logger.NOTICE)); // 2>
		logger2 = logger2.setNext(new StderrLogger(Logger.ERR)); // 2>

		logger1.message("명령어 1", Logger.DEBUG);
		logger1.message("명령어 2", Logger.NOTICE);
		logger1.message("명령어 3", Logger.ERR);
	}
}

abstract class Logger {
	public static int ERR = 3;
	public static int NOTICE = 5;
	public static int DEBUG = 7;
	protected int mask;

	protected Logger next;

	public Logger setNext(Logger log) {
		next = log;
		return log;
	}

	public void message(String msg, int priority) {
		if (priority <= mask) {
			writeMessage(msg);
		}
		if (next != null) {
			next.message(msg, priority);
		}
	}

	abstract protected void writeMessage(String msg);
}

class StdoutLogger extends Logger { // 1>
	public StdoutLogger(int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println(" * 로그 발생 : " + msg);
	}
}

class EmailLogger extends Logger { // 1>
	public EmailLogger(int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println(" * 메일 발송 : " + msg);
	}
}

class StderrLogger extends Logger { // 1>
	public StderrLogger(int mask) {
		this.mask = mask;
	}

	@Override
	protected void writeMessage(String msg) {
		System.err.println(" * 에러 발생 : " + msg);
	}
}