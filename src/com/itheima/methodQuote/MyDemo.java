package com.itheima.methodQuote;

import com.itheima.lambda.Student;
import com.itheima.lambda.StudentStatic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"张三","M"));
        students.add(new Student(1,"李四","M"));
        students.add(new Student(3,"王五","F"));
        
        students.sort((s1,s2)->s1.getId().compareTo(s2.getId()));

        // sort 只有一个参数，无法满足
//        students.sort(Student::getId);



        List<StudentStatic> studentStatic = new ArrayList<>();

        studentStatic.add(new StudentStatic());
//        StudentStatic.add(new Student(1,"李四","M"));
//        StudentStatic.add(new Student(3,"王五","F"));
        studentStatic.sort(StudentStatic::getAge);

        // Comparator.comparing(  )

        // 看不懂
        Comparator<Student> comparator = Comparator.comparing((Student s) -> s.getId());

        //students.sort(Comparator.comparing((s)->s.getId()));

        //
        students.sort(Comparator.comparing(Student::getId));

        System.out.println(students);

    }
}
