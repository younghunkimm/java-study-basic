package chapter3.generic;

public class Main {
    public static void main(String[] args) {
        // === 1. 재사용 불가 ===
        Box box1 = new Box(100);
        // Box box2 = new Box("ABC");
        // Box box3 = new Box(0.1);

        // === 2. 낮은 타입 안정성 ===
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);
        
        // item 을 활용하기 위해서는 down casting 필요
        Object item = (String) strBox.getItem();
        System.out.println("item = " + item);

        // ClassCatsException(RuntimeException) 발생
        // - 타입 안정성이 낮다
        // - 사전 방지가 어렵다
        // String item2 = (String) intBox.getItem();
        // System.out.println("item2 = " + item2);

        // === Generic 활용 ===
        // 1. ✅ 재사용성 보장 (컴파일 시 타입 소거: T → Object)
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(100);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.1);

        // 2. ✅ 타입 안정성 보장 (컴파일 시 타입 소거: 자동으로 다운캐스팅)
        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);
        
        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        // === Generic Method 활용 ===
        // ⚠ 일반 메서드: 클래스 타입 매개변수<T>를 따라간다.
        // String 데이터 타입 기반으로 타입소거가 발생
        // 컴파일 시 String 타입의 다운캐스팅 코드 삽입
        strGBox.printItem("ABC");
        // strGBox.printItem(100);
        // strGBox.printItem(0.1);

        // Generic 메서드 (strGBox: 클래스 타입<T> String 과 상관 없음)
        // ✅ Generic 메서드: 독립적인 타입 매개변수를 가진다.
        // 클래스 타입<T>(String) 정보가 제네릭 메서드에 아무런 영향을 주지 못한다.
        // 다운캐스팅 코드 삽입되지 않음
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(123);
        strGBox.printBoxItem(0.1);
    }
}
