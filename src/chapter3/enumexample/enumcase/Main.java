package chapter3.enumexample.enumcase;

public class Main {
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;

        // switch 문으로 전달한 데이터 타입이 Fruit 이기 때문에 상수만 넣어도 되는 것
        switch (type) {
            case APPLE:
                System.out.println(57 + " kcal, color: " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + " kcal, color: " + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + " kcal, color: " + Fruit.BANANA.getColor());
                break;
        }

        /**
         * ✅ values
         *
         * Fruit 가 가지고 있는 상수의 집합
         */
        for (Fruit f : Fruit.values()) {
            System.out.println(f + ": " + f.getColor());
        }
    }
}
