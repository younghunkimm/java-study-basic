package chapter3.enumexample.interfacecase;

interface FRUIT {
    int APPLE = 1, ORANGE = 2, BANANA = 3;
}

interface COMPANY {
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class Main {
    public static void main(String[] args) {
        // 인터페이스의 멤버변수가 상수 처리되는 기능을 이용하는 방법
        int type = FRUIT.APPLE;

        // 💥 BUT
        // 비교할 수 없는 대상을 비교할 때 컴파일러가 에러를 잡지 못한다.
        // 해당 문제를 해결하기 위해서는 `ENUM` 을 활용해야 한다.
        if (FRUIT.APPLE == COMPANY.APPLE) {
            System.out.println("과일애플과 기업애플은 같습니다.");
        }

        switch (type) {
            case FRUIT.APPLE:
                System.out.println(57 + " kcal");
                break;
            case FRUIT.ORANGE:
                System.out.println(34 + " kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93 + " kcal");
                break;
        }
    }
}
