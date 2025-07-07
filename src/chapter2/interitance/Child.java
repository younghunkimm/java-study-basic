package chapter2.interitance;

public class Child extends Parent {
    public String familyName = "kyh";

    public Child() {
        super();

        // 추가적인 로직은 무조건 super() 아래 작성
        System.out.println("자식 생성자");
    }

    public void superTest() {
        System.out.println(super.familyName);
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }
}
