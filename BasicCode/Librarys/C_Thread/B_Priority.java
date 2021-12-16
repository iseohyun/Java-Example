package C_Thread;

public class B_Priority {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadWithRunnable());
		Thread thread2 = new Thread(new ThreadWithRunnable());

		thread1.setPriority(10);

		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());

		thread1.start();
		thread2.start();
	}
}