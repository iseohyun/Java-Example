package g_Thread;

public class D_sync {
    static int seq = 0;

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    synchronized (lock) {
                        while (true) {
                            System.out.print(i++);
                            if (i == 10) {
                                i = 0;
                                System.out.println("> " + seq++);
                                lock.notify(); // thread2를 깨움
                                lock.wait(); // thread2에게 대기하도록 함
                                if (seq > 4)
                                    System.exit(0); // 시스템 종료
                            }
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                char c = 'A';
                try {
                    synchronized (lock) {
                        while (true) {
                            System.out.print(c++);
                            if (c == 'Z' + 1) {
                                c = 'A';
                                System.out.println("> " + seq++);
                                lock.notify(); // thread1을 깨움
                                lock.wait(); // thread1에게 대기하도록 함
                            }
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
