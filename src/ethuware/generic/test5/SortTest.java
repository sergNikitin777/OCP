package ethuware.generic.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

class Person{
    String name;
    String dob;
    public Person(String name, String dob){
        this.name = name; this.dob = dob;
    }
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
}
class MySorter {
    public int compare(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
}
public class SortTest {
    public static int diff(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }

    public static int diff(Date d1, Date d2){
        return d1.compareTo(d2);
    }
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));

        //INSERT CODE HERE

        System.out.println("before sort");
        al.stream().map(p->p.getName() +":"+p.getDob()).forEach(System.out::println);

        //Collections.sort(al, (p1, p2)->p1.dob.compareTo(p2.dob));
        //Collections.sort(al, SortTest::diff);
        Collections.sort(al, new MySorter()::compare);
        //Arrays.sort(al, SortTest::diff);

        System.out.println("after sort");

        al.stream().map(p->p.getName() +":"+p.getDob()).forEach(System.out::println);
    }
}
