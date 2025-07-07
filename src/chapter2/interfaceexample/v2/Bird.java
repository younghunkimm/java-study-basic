package chapter2.interfaceexample.v2;

// 다중 상속
public class Bird implements FlyableAnimal {

    @Override
    public void eat() {
        System.out.println("새가 먹이를 먹습니다.");
    }

    @Override
    public void fly() {
        System.out.println("새가 하늘을 납니다.");
    }

    @Override
    public void land() {
        System.out.println("새가 착륙합니다.");
    }

}
