package chapter2.interfaceexample.v2;

// 다중 상속
public interface FlyableAnimal extends Animal, Flyable {
    void land(); // 추가 기능
}
