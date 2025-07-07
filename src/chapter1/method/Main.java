package chapter1.method;

public class Main {

    public static void main(String[] args) {

        // 1. 객체를 객체화(인스턴스화) 한다.
        Calculator calculator = new Calculator();

        // 2. 메서드 호출
        int a = calculator.sum(1, 2);
        System.out.println(a);

        // 3. void
        calculator.sum2(3, 4);

    }
}
