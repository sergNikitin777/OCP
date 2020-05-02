package ethuware.stest3.test11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;
    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return name+":"+marks;
    }
    //getters and setters not shown

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
public class TestClass {
    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(new Student("S1", 20), new Student("S3", 30), new Student("S3", 20) );
        //INSERT CODE HERE
        Map<Integer, List<Student>> grouping = ls.stream().collect(Collectors.groupingBy(s ->s.getMarks()));

        System.out.println(grouping);
    }
}
