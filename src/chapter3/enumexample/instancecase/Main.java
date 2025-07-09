package chapter3.enumexample.instancecase;

class Fruit {
    // 자기 자신을 인스턴스화한 값을 상수에 넣는다.
    // 서로 다른 인스턴스이기 때문에 각각의 값이 다르다.
    // 하지만 각각의 데이터 타입은 같다!
    public static final Fruit APPLE = new Fruit();
    public static final Fruit ORANGE = new Fruit();
    public static final Fruit BANANA = new Fruit();
}

class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class Main {
    public static void main(String[] args) {
        // ✅ 서로 다른 데이터타입이기 때문에 비교 불가능 (컴파일러가 감지)
        // if (Fruit.APPLE == Company.APPLE) {
        //     System.out.println("과일 애플과 회사 애플이 같다.");
        // }

        // 💥 But
        // switch 문을 사용할 수 없게 된다.
        // switch 문은 몇가지 제한된 데이터 타입만을 사용할 수 있다.
        // byte, short, char, int, enum, String, Character, Byte, Short, Integer
        // Fruit type = Fruit.APPLE;
        // switch (type) {
        //     case Fruit.APPLE:
        //         System.out.println(57 + " kcal");
        //         break;
        //     case Fruit.ORANGE:
        //         System.out.println(34 + " kcal");
        //         break;
        //     case Fruit.BANANA:
        //         System.out.println(93 + " kcal");
        //         break;
        // }
    }
}
