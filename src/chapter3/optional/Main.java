package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        // Student steve = new Student("Steve");
        // camp.setStudent(steve);
        
        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent(); // Optional 객체 안에 데이터가 들었는지 null이 들었는지 확인하는 기능

        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        // 1. student = null
        // Student student = camp.getStudent();
        // System.out.println("student = " + student);

        // 직접적인 null 처리 방법
        // 가능은 하지만 객체가 많아질수록 관리 어려움
        // String studentName;
        // if (student != null) {
        //     studentName = student.getName();
        // } else {
        //     studentName = "등록된 학생이 아닙니다.";
        // }

        // 2. NullPointerException
        // String studentName = student.getName();
        // System.out.println("studentName = " + studentName);
    }
}
