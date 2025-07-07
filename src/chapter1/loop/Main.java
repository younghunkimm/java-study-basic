package chapter1.loop;

public class Main {

    public static void main(String[] args) {
        // for 문
        int customers = 5;
        for (int i = 1; i <= customers; i++) {
            if (i == 4) break;
            if (i == 2) continue;
            System.out.println(i + "번째 for 손님, 안녕하세요!");
        }

        // while 문
        int i = 1;
        while (i <= 3) {
            System.out.println(i + "번째 while 손님, 안녕하세요!");
            i++;
        }

        // do-while 문
        int j = 10;
        do {
            System.out.println(j + "번째 do-while 손님, 안녕하세요!");
            j--;
        } while (j < 4);
    }
}
