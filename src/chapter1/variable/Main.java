package chapter1.variable;

public class Main {

    public static void main(String[] args) {

        // [자료형] [변수이름][세미콜론]
        
        // 정수형
        int a;
        a = 1;
        a = 2;
        System.out.println("a = " + a);

        // 논리형
        boolean booleanBox = true;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);
        
        // 문자형 (홀따옴표)
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);
        
        // 실수형 (8자리 까지 잘려서 표현된다)
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;
        System.out.println("floatBox = " + floatBox);
        
        double doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);
        
        
        
        // 캐스팅 (Casting)
        // 다운캐스팅: 큰 데이터를 -> 작은 상자
        double bigBox = 10.523;
        int smallBox = (int) bigBox; // 명시적 형변환
        System.out.println("smallBox = " + smallBox);

        // 업캐스팅: 작은 데이터를 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2; // 데이터 손실이 일어나지 않기 때문에 명시적 형변환 X
        System.out.println("bigBox2 = " + bigBox2);



        // 문자열 데이터 (쌍따옴표)
        String str = "안녕하세요!";
        System.out.println("str = " + str);
        
        
    }
}
