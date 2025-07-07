package chapter2.staticexample;

public class Main {

    public static void main(String[] args) {
        Person.printPopulation();

        // === instance 멤버 ===
        // instance 멤버 활용
        Person p1 = new Person();
        Person p2 = new Person();

        // instance 변수 활용
        p1.name = "kyh";
        p2.name = "Steve";

        // instance 메서드 활용
        p1.printName();
        p2.printName();

        // === class 멤버 ===
        // static 변수, 메서드 활용
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();
    }
}
