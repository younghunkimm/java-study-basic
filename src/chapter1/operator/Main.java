package chapter1.operator;

public class Main {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        
        // 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나눗셈
        // 10 / 3
        int div = a / b; // 나머지가 버려진다.
        System.out.println("div = " + div);

        // a / 3.0
        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);
        
        // 나머지 (모듈러 연산자)
        int mod = 10 % 3;
        System.out.println("mod = " + mod);
        
        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);
        
        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);
        
        // 시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);
        
        // 짝수 홀수 판별
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);
        
        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);

        // 대입 연산자
        int num = 5;

        // 복합 대입 연산자
        num += 3; // num = num + 3
        System.out.println("num = " + num);

        num -= 2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 3;
        System.out.println("num = " + num);

        num %= 3;
        System.out.println("num = " + num);

        // 증감 연산자
        num = 1;
        num++; // + 1
        num++; // + 1
        num--; // - 1
        num--; // - 1
        System.out.println("num = " + num);
        
        // 전위 연산 (++i): 연산 후 값이 활용
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));
        
        // 후위 연산
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        // 문자열 비교
        String text = "Hello";
        String text2 = "Hello";
        // 나쁜예) text == text2
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual);
        
    }
}
