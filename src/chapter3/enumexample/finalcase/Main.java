package chapter3.enumexample.finalcase;

public class Main {
    private final static int APPLE = 1;
    private final static int ORANGE = 2;
    private final static int BANANA = 3;

    private final static int GOOGLE = 1;
    // private final static int APPLE = 2; // 💥 상수 중복 선언으로 오류 발생
    private final static int ORACLE = 3;

    public static void main(String[] args) {
        int type = APPLE;

        switch (type) {
            case APPLE:
                System.out.println(57 + " kcal");
                break;
            case ORANGE:
                System.out.println(34 + " kcal");
                break;
            case BANANA:
                System.out.println(93 + " kcal");
                break;
        }
    }
}
