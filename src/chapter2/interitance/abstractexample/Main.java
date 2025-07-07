package chapter2.interitance.abstractexample;

public class Main {

    public static void main(String[] args) {
        // 추상 클래스는 인스턴스화 할 수 없다
        // Animal animal = new Animal();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat(); // 자식에서 강제 구현된 메서드
    }

}
