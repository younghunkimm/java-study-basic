package chapter2.interitance;

public class Parent {
    public String familyName = "스파르탄";
    public int honor = 10;

    public Parent() {
        System.out.println("부모 생성자");
    }

    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + "가문은 대대로 ....");
    }

    public void showSocialMedia() {
        System.out.println("SNS에서 우리 가문을 소개해드립니다.");
    }
}
