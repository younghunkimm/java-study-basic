package chapter2.interitance.abstractexample;

// 추상클래스 선언
abstract class Animal {

    public String name;

    // 자식 클래스에게 강제로 구현하도록 한다
    abstract void eat();

    public void sleep() {
        System.out.println("쿨쿨..");
    }

}
