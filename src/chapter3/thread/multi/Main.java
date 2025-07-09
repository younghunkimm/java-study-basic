package chapter3.thread.multi;

public class Main {
    public static void main(String[] args) {
        /**
         * 멀티 쓰레드 (Multi Thread)
         *
         * - `멀티 쓰레드`는 작업을 처리할 수 있는 여러 명의 일꾼을 의미한다.
         * - 멀티 쓰레드를 활용해서 여러 작업(0 ~ 9 출력)을 병렬(동시)로 처리할 수 있다.
         * - `Thread` 클래스를 상속받아 `쓰레드`를 구현할 수 있다.
         * - `Thread.run()` 메서드를 오버라이드 해서 `쓰레드`가 수행할 작업을 정의할 수 있다.
         * - `start()` 메서드를 호출하면 새로운 쓰레드가 생성되고 `run()`의 작업내용이 실행된다.
         * - 총 3개의 쓰레드(`main`, `thread0`, `thread1`)가 `병렬`로 실행된다.
         * - `main` 쓰레드는 `thread0`, `thread1` 을 생성하고 실행시킨다.
         * - 생성된 `thread0`, `thread1`는 0.5초마다 0 ~ 9까지의 숫자를 출력한다.
         */
        System.out.println("::: main 쓰레드 시작 :::");

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

        // 1. thread0 시작
        System.out.println("thread0 시작");
        // `run()` 을 실행하게 되면 일반 메서드 실행이랑 같아지기 때문에
        // 새로운 Thread 에서 `run()` 을 실행시킬 수 있도록 `start()` 메서드를 사용한다.
        thread0.start();

        // 2. thread1 시작
        System.out.println("thread1 시작");
        thread1.start();

        System.out.println("::: main 쓰레드 종료 :::");
    }
}
