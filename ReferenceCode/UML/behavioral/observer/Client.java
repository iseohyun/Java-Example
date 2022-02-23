
package behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;

/**
 * 출처 : https://ko.wikipedia.org/wiki/%EC%98%B5%EC%84%9C%EB%B2%84_%ED%8C%A8%ED%84%B4
 *
 * @author Seohyun Jung
 *
 *		옵저버 패턴 : 상태를 감지하는 쓰레드를 동작시킨 후에 동작이 발생하면 해당 동작을 수행		
 *
 */

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String args[]) {
		System.out.println("문자열을 입력하세요 >");
		final EventSource evSrc = new EventSource();
		final ResponseHandler respHandler = new ResponseHandler();

		evSrc.addObserver(respHandler);

		Thread thread = new Thread(evSrc);
		thread.start();
	}
}

@SuppressWarnings("deprecation")
class EventSource extends Observable implements Runnable {
	public void run() {
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
			while (true) {
				final String response = br.readLine();
				setChanged();
				notifyObservers(response);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

@SuppressWarnings("deprecation")
class ResponseHandler implements Observer {
	private String resp;

	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			resp = (String) arg;
			System.out.println("입력받은 문자열 [" + resp.length() + "]글자 - " + resp);
		}
	}
}