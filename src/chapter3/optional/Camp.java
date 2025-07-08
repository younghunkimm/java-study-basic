package chapter3.optional;

import java.util.Optional;

public class Camp {
    // 속성
    private Student student;

    // 생성자

    // 기능
    // ✅ null 이 반환될 수 있음을 명확하게 표시
    public Optional<Student> getStudent() {
        return Optional.ofNullable(student);
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
