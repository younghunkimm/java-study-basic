package chapter3.enumexample.enumcase;

/**
 * ✅ 열거형의 특성
 *
 * - 연관된 값들을 저장한다.
 * - 또 그 값들이 변경되지 않도록 보장한다.
 * - 열거형 자체가 `Class`이기 때문에 내부에 `생성자`, `필드`, `메소드`를 가질 수 있다.
 */
public enum Fruit {
    APPLE("red"),
    PEACH("pink"),
    BANANA("yellow");

    private String color;

    Fruit(String color) {
        // 상수들의 값이 세팅될 때마다 인스턴스화 되면서 생성자 호출됨
        // 상수가 3개이기 때문에 `Call Constructor` 가 3번 호출된다.
        System.out.println("Call Constructor" + this);

        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
