package chapter3.exception;

public class Main {
    public static void main(String[] args) {
        // 예외는 상위로 전파된다.

        // 의도하지 않은 예외
        // int ret = 10 / 0;
        // System.out.println("ret = " + ret);
        // System.out.println("프로그램 종료");

        // 의도적인 예외 (throw)
        // int age = 10;
        // if (age < 18) {
        //     throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
        // }

        // 1. 언체크 예외
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        try {
            exceptionPractice.callUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("언체크 예외 처리");
        }

        // 2. 체크 예외 호출
        try {
            exceptionPractice.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }

        System.out.println("프로그램 종료");

    }
}
