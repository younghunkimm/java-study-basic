package chapter2.capsulation;

/**
 * `public`: 어디서든 접근 가능
 * `protected`: 상속한 클래스
 * `default`: 같은 패키지 내부
 * `private`: 같은 클래스 내부
 */
public class Person {

    // 속성
    public String name;
    private String gender;
    private String secret;

    // 생성자
    // 생성자의 접근제어자를 private 로 설정하면 객체 생성이 불가능
    public Person(String gender) {
        this.gender = gender;
    }

    // 기능
    public void methodA() {}
    private void methodB() {}

    // 게터
    public String getGender() {
        return gender;
    }

    // 세터
    public void setGender(String gender) {
        this.gender = gender;
    }
}
