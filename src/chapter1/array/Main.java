package chapter1.array;

public class Main {

    public static void main(String[] args) {
        // 모험가 명단을 관리하는 법
        String name1 = "Jake";
        String name2 = "Steve";
        // ...

        String[] adventurerList = {"Jake", "Steve", "..."};



        // 1. 배열 선언
        // int[] arr;

        // 2. 배열 길이 할당
        // arr = new int[5];

        // 3. 배열 선언과 길이 동시에 할당
        // int[] arr = new int[5];

        // 4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr = {10, 20, 30, 40, 50};
        
        // 배열의 길이
        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);

        // 문자열 배열 선언
        String[] strArr = new String[5];

        // 논리형 배열 선언
        boolean[] boolArr = new boolean[3];



        // 배열의 요소에 접근: 인덱스 활용 방법
        int[] arrIndex = {10, 20, 30, 40, 50};
        arrIndex[0] = 100;
        arrIndex[1] = 200;
        arrIndex[2] = 300;
        arrIndex[3] = 400;
        arrIndex[4] = 500;

        System.out.println("배열의 1 번째 요소 접근: " + arrIndex[0]);
        System.out.println("배열의 2 번째 요소 접근: " + arrIndex[1]);
        System.out.println("배열의 3 번째 요소 접근: " + arrIndex[2]);
        System.out.println("배열의 4 번째 요소 접근: " + arrIndex[3]);
        System.out.println("배열의 5 번째 요소 접근: " + arrIndex[4]);

        // 배열 탐색
        System.out.println("=== 배열 탐색 ===");
        for (int i = 0; i < arrIndex.length; i++) {
            System.out.println("인덱스: " + i + ", 값: " + arrIndex[i]);
        }

        // 향상된 for 문
        System.out.println("=== 향상된 for 문 ===");
        for (int a : arrIndex) {
            System.out.println("값: " + a);
        }

        // 2차원 배열
        boolean[][] board = new boolean[2][2];
        board[0][0] = true;
        board[0][1] = false;
        board[1][0] = false;
        board[1][1] = true;

        boolean[][] board2 = {
                {true, false},
                {false, true}
        };

    }
}
