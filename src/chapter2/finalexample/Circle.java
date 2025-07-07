package chapter2.finalexample;

public class Circle {
    // 속성
    final static double PI = 3.14159;
    final double radius; // final 로 선언해서 값이 변경되지 않도록 한다

    // 생성자
    Circle(double radius) {
        this.radius = radius;
    }

    // 기능
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);
    }

}
