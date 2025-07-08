package chapter3.exception;

public class ExceptionPractice {
    // 1. 언체크 예외 호출 예시
    public void callUncheckedException() {
        if (true) {
            System.out.println("언체크 예외 발생");
            throw new RuntimeException(); // 컴파일러가 확인할 수 없다
        }
    }
    
    // 2. 체크 예외 호출 예시
    public void callCheckedException() throws Exception {
        /**
         * throws Exception
         *
         * 컴파일러가 에러 확인이 가능하기 때문에
         * 메서드를 호출한 상위 메서드에서 처리하겠다는 것을 명시해준다
         */
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }

        // try {
        //     if (true) {
        //         System.out.println("체크 예외 발생");
        //         throw new Exception();
        //     }
        // } catch (Exception e) {
        //     System.out.println("체크 예외 처리");
        // }
    }
}
