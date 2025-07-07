package chapter2.interfaceexample.v3;

public interface Config {
    // 인터페이스에 변수를 선언하는 경우
    // `static` 으로 선언되기 때문에 구현체 없이도 활용 가능
    // 인터페이스는 표준의 역함임으로 변수 선언은 최소화하는 것이 좋다

    int POPULATION = 100; // public static final 로 선언이 된다
}
