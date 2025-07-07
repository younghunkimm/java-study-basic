package chapter2.capsulation;

public class Main {

    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("남자");

        // 인스턴스 변수 접근
        person.name = "kyh";
        // person.secret = "??"; ❌

        // 인스턴스 메서드 접근
        person.methodA();
        // person.methodB(); ❌

        // 게터
        String gender = person.getGender();
        System.out.println("gender = " + gender);

        // 세터
        person.setGender("여자");
        String gender2 = person.getGender();
        System.out.println("gender2 = " + gender2);

    }

}
