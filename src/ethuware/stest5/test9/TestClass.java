package ethuware.stest5.test9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Course{
    private String id;
    private String name;

    public Course(String id, String name){
        this.id = id; this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class TestClass {
    public static void main(String[] args) {
        List<Course> cList = Arrays.asList(
                new Course("803", "OCAJP 7"),
                new Course("808", "OCAJP 8"),
                new Course("809", "OCPJP 8")
        );

       String courses = cList.stream().filter(c->c.getName().indexOf("8")>-1)
                .map(c->c.getId())
                .collect(Collectors.joining("1Z0-"));
        cList.stream().forEach(c->System.out.println(c.getId()));

        System.out.println(courses);
    }
}
