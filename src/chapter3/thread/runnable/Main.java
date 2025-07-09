package chapter3.thread.runnable;

public class Main {
    public static void main(String[] args) {
        MyRunnable myTask = new MyRunnable(); // ✅ 하나의 작업 객체 선언

        // 기능을 확장해서 사용
        myTask.printMessage();

        // ✅ 하나의 작업을 여러 쓰레드에서 공유
        Thread thread0 = new Thread(myTask); // 작업 객체 공유
        Thread thread1 = new Thread(myTask); // 작업 객체 공유

        // 실행
        thread0.start();
        thread1.start();
    }
}
