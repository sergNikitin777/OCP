package ethuware.stest5.test12;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

    public static enum Grade{ A, B , C, D, F}

    private String name;
    private Grade grade;
    public Student(String name, Grade grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString(){
        return name+":"+grade;
    }
    //getters and setters not shown

     public String getName() {
         return name;
     }

     public Grade getGrade() {
         return grade;
     }
 }
public class TestClass {
    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));
//INSERT CODE HERE
        Map<Student.Grade, List<String>> grouping = ls.stream().collect(
                Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(grouping);
    }
}
