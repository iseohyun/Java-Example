package g_Thread;

public class E_interrupted {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        System.out.println("스레드 실행 중...");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    // InterruptedException이 발생하면 스레드를 종료합니다.
                    System.out.println("스레드가 인터럽트되어 종료됩니다.");
                }
            }
        });

        thread.start();

        // 3초 후에 스레드를 중단시킵니다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

        // 스레드가 종료될 때까지 기다립니다.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료");
    }
}
