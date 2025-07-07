package chapter2.finalexample;

public class Main {

    public static void main(String[] args) {

        // final 활용 방법
        final int a = 1;
        // a = 2;
        System.out.println("a = " + a);

        // 상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);
        
        // 불변 객체 활용
        final Circle c1 = new Circle(2);
        // c1 = new Circle(5); // 참조 변경을 막지만 내부 상태 변경은 가능
        System.out.println("c1 = " + c1);

        // 불변 객체의 내부 상태가 변경이 필요한 경우
        Circle c2 = new Circle(10); // 생성자
        Circle c3 = c2.changeRadius(20); // 기능을 활용

    }
}
