/*
 * 두 가지 형태의 쓰레드를 생성합니다.
 * 
 * 쓰레드는 하나의 어플리케이션에서 여러개가 생성 될 수 있습니다.
 * 기본적으로 하나의 쓰레드가 동작하는 동안 다른 쓰레드는 대기합니다.(동기화:synchronization)
 */
package g_Thread;

class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + val++);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static int val = 0;
}

public class A_Thread {
    public static void main(String[] args) {
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2 = new Thread(new ThreadWithRunnable());
        thread1.start();
        thread2.start();
    }
}