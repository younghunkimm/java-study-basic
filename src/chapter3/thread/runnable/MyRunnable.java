package chapter3.thread.runnable;

/**
 * ✅ Runnable 인터페이스 활용(권장)
 * - 1️⃣ 유지 보수성과 재사용성 향상
 * - 2️⃣ 확장 가능성
 *
 * ✅ 기존 클래스를 유지하면서 확장 가능
 * - 1️⃣ `Thread`를 상속해서 `MyThread`를 구현하면 다른 클래스를 상속받지 못한다.
 *    → Java는 클래스의 다중 상속을 지원하지 않는다.
 *    → `Thread`를 상속하면 다른 클래스를 상속할 수 없어서 확장성이 떨어진다.
 * - 2️⃣ `Runnable` 은 인터페이스이므로 기존 클래스의 기능을 유지하면서 상속을 통해 확장할 수 있다.
 */

// ✅ 실행 로직을 분리
public class MyRunnable extends MyNewClass implements Runnable {
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
