package chapter3.thread.multi;

// ✅ Thread 클래스 상속으로 쓰레드 구현

// +
// ❗ `Thread` 를 상속받음으로써 Thread 제어 역할 그리고 실행로직 두가지를 담당하게 됨
// ✅ Runnable 구현체로 실행로직을 분리하는 것이 좋다.
public class MyThread extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드: " + threadName);

        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드 : " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 딜레이 0.5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("종료된 쓰레드: " + threadName);
    }
}
