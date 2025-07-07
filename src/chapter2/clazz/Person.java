package chapter2.clazz;

public class Person {
    // 1. 속성 - 변수 선언으로 표현
    String name;
    int age;
    String address;

    // 2. 생성자
    // 명시하지 않았다면 우리 눈에는 안보일 뿐 생성자는 존재한다.

    /**
     * 2-1. 생성자의 특징
     *
     * 1) 클래스와 이름이 같다
     * 2) 반환 타입이 존재하지 않는다
     * 3) 여러개가 존재할 수 있다
     */
    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 기능
    int sum (int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // getter
    String getName() {
        return this.name;
    }

    // setter
    void setAddress(String address) {
        this.address = address;
    }
}
