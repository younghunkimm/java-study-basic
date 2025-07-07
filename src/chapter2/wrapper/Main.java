package chapter2.wrapper;

public class Main {

    public static void main(String[] args) {
        // 래퍼클래스 + 참조형변수
        
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);

        // === 참조형 변수 ===
        // 객체
        Person personA = new Person();
        System.out.println("personA = " + personA); // 객체가 담긴 Heap 메모리의 주소값이 출력된다

        // 배열
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr = " + arr); // 배열이 담긴 Heap 메모리의 주소값이 출력된다

        // 래퍼클래스
        Integer num = 100; // 불변 (final)
        System.out.println("num = " + num); // 숫자 출력 이유: 내부적으로 `toString()` 이 `overriding` 되어 있기 때문

        String numStr = num.toString(); // 래퍼클래스의 기능을 사용하여 간편하게 문자열로 변환 가능
        System.out.println("numStr = " + numStr);

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();
        System.out.println("myStrInteger = " + myStrInteger);

        // === 오토 박싱 & 오토 언박싱 (Java 에서 지원) ===
        // 오토 박싱 (기본형 > 래퍼클래스)
        Integer num3 = 10;
        Integer.valueOf(10); // 내부적으로 일어나는 일
        
        // 오토 언박싱 (래퍼클래스 > 기본형)
        int num4 = num3;
        num3.intValue(); // 내부적으로 일어나는 일

    }
}
