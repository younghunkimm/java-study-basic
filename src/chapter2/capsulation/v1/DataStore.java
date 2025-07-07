package chapter2.capsulation.v1;

// 핵시설 관리하는 개발자
public class DataStore {
    // "B" 문자열이 들어오면 핵폭발 발생..!
    private String store;

    // 세터를 사용하여 데이터 보호
    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B가 입력되면 안됩니다.");
        } else {
            this.store = store;
        }
    }
}
