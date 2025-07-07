package chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    String name;

    // 인스턴스 메서드
    void printName() {
        System.out.println("나의 이름은 " + this.name + " 입니다.");
    }

    /**
     * static
     *
     * 프로그램 실행 시점에
     * class 의 정보가
     * method area 에 저장되기 때문에
     * 공용으로 사용할 수 있다
     *
     * 💥 주의사항
     * `static` 변수와 메모리는 프로그램이 종료될 때까지 메모리에 유지되므로
     * 너무 많은 `static` 남용은 메모리 낭비로 이어진다
     */

    // static 변수
    static int population = 0;

    Person() {
        population++;
    }

    // static 메서드
    static void printPopulation() {
        // static 메서드 안에서 instance 변수를 사용하고 싶다면
        // instance 를 생성해야 한다
        /*
        * Person p3 = new Person();
        * System.out.println(p3.name);
        */

        System.out.println("현재 인구 수: " + population);
    }
}
