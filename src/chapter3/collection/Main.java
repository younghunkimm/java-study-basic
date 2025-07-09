package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // === 배열 ===
        // 배열의 한계 (정적)
        // 선언과 동시에 길이 설정
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // numbers[3] = 40; // ArrayIndexOutOfBoundsException 💥


        // === 컬렉션 ===
        // 객체<다룰 데이터> 변수 이름 = new 컬렉션객체생성자<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40); // 길이 제한 없음

        // === ArrayList ===
        // 특징: 순서 유지, 중복 허용
        ArrayList<String> names = new ArrayList<>();
        
        // 데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        names.add("2");

        // ✅ 순서 보장
        System.out.println("names = " + names);

        // ✅ 중복 허용
        names.add("Spartan");
        System.out.println("names = " + names);
        
        // ✅ 데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = " + name1);
        
        // ✅ 데이터 삭제
        names.remove("Steve");
        names.remove("Spartan");
        System.out.println("names = " + names);

        // === HashSet ===
        // 특징: 순서 없음, 중복 불가
        HashSet<String> uniqueNames = new HashSet<>();

        // ✅ 데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");
        
        // ⚠ 순서를 보장 안함 (`get()` 사용 불가)
        System.out.println("uniqueNames = " + uniqueNames);
        
        // ⚠ 중복 데이터 불가
        uniqueNames.add("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // ✅ 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // === HashMap ===
        // 특징: 키-값 구조, 키 중복 불가
        HashMap<String, Integer> memberMap = new HashMap<>();

        // ✅ 데이터 추가
        memberMap.put("Spartan", 15);
        memberMap.put("Steve", 15);
        memberMap.put("Isac", 1);
        memberMap.put("John", 2);
        memberMap.put("Alice", 3);

        System.out.println("memberMap = " + memberMap); // 순서 보장 X
        
        // ⚠ 키 중복 불가 (덮어쓰기 발생)
        memberMap.put("Alice", 5);
        System.out.println("memberMap = " + memberMap);
        
        // ✅ 단건 조회
        Integer SpartanNum = memberMap.get("Spartan");
        System.out.println("SpartanNum = " + SpartanNum);
        
        // ✅ 데이터 제거
        memberMap.remove("Spartan");
        System.out.println("memberMap = " + memberMap);
        
        // ✅ 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);
        
        // ✅ 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
