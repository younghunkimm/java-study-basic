package chapter3.thread.single;

public class Main {
    public static void main(String[] args) {
        /**
         * 싱글 쓰레드 (Single Thread)
         *
         * - `싱글 쓰레드`는 한 명의 일꾼이 작업을 처리하는 것과 같다.
         * - 일꾼이 한명이기 때문에 여러개의 작업이 있다면 순차적으로 처리해야한다.
         * - `main()` 메서드는 프로그램 시작과 동시에 생성되는 하나의 쓰레드이다.
         * - 아래 코드는 `main()` 하나의 쓰레드가 작업을 처리하는 예시
         */

        System.out.println("::: main 쓰레드 시작 :::");
        String threadName = Thread.currentThread().getName();

        // ✅ 하나의 작업 단위: 숫자를 0 ~ 9 까지 출력
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드이름: " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 0.5초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // ✅ 추가 작업
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드이름: " + threadName + " - " + i);
            try {
                Thread.sleep(500); // 0.5초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("::: 작업 끝 :::");
    }
}
