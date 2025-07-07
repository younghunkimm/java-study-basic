package chapter2.clazz;

public class Main {

    public static void main(String[] args) {
        // 객체 생성(인스턴스화)
        Person personA = new Person("Jake", 20);
        Person personB = new Person("Steve", 15);

        // 속성에 직접 접근
        System.out.println("설정 전 personA 이름: " + personA.name);
        System.out.println("설정 전 personB 이름: " + personB.name);
        personA.name = "Jake";
        personB.name = "Steve";
        System.out.println("설정 후 personA 이름: " + personA.name);
        System.out.println("설정 후 personB 이름: " + personB.name);

        // 기능 활용
        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(2, 4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        
        // getter 활용
        String name = personA.getName();
        System.out.println("name = " + name);

        // setter 활용
        personA.setAddress("서울");
        System.out.println("personA의 주소: " + personA.address);

    }
}
