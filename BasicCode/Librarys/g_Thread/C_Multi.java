package g_Thread;

public class C_Multi {
	public static void main(String[] args) {
		Thread thread0 = new Thread(new ThreadWithRunnable());
		System.out.println(thread0.getThreadGroup());

		ThreadGroup group = new ThreadGroup("myThread");
		Thread thread1 = new Thread(group, new ThreadWithRunnable());
		group.setMaxPriority(7);
		System.out.println(thread1.getThreadGroup());

		thread0.start();
		thread1.start();
	}
}