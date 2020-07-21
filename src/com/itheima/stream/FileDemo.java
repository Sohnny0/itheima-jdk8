package com.itheima.stream;

import com.itheima.lambda.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileDemo {

    public static void main(String[] args) throws IOException {
/*

        //获取所有的文件列表信息
        //Files.list(Paths.get("D:\\workspace\\itheima\\demo")).forEach(path-> System.out.println(path));
        Files.list(Paths.get("D:\\workspace\\itheima\\demo")).forEach(path-> {

            System.out.println(path);

            //读取每一个文件中的内容信息
            try {
                Files.lines(path).forEach(content-> System.out.println(content));
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
*/


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"张三","M",19,true));
        studentList.add(new Student(1,"李四","M",18,true));
        studentList.add(new Student(1,"王五","F",21));
        studentList.add(new Student(1,"赵六","F",20));

        // 还是不明白, 为什么都被认为是函数式接口
        System.out.println(studentList.stream().filter(Student::isPass).collect(Collectors.toList()));

        System.out.println(studentList.stream().filter(s -> s.getIsPass()).collect(Collectors.toList()));
    }
}
