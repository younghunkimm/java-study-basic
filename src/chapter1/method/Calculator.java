package chapter1.method;

public class Calculator {

    // 메서드 선언: 두 수를 더합니다.
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    void sum2(int value1, int value2) {
        int result = value1 + value2;
        System.out.println("결과는: " + result);
    }
}
