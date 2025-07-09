package chapter3.generic;

public class GenericBox<T> {
    // 속성
    private T item;

    // 생성자
    public GenericBox(T item) {
        this.item = item;
    }

    // 기능
    public T getItem() {
        return this.item;
    }

    // ⚠ 일반 메서드 (T item 은 클래스의 <T> 를 따라간다.)
    public void printItem(T item) {
        System.out.println(item);
    }

    // ✅ 제너릭 메서드 (<S> 는 <T> 와 별개로 독립적이다.)
    // <S> <A> <B> 원하는대로 사용 가능
    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }

    public <A> void printBoxItem2(A item) {
        System.out.println(item);
    }
}
