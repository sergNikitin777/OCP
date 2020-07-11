package ethuware.stest2.test30;

import java.util.Arrays;
import java.util.List;

class Item{
    private int id;
    private String name;
    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}


public class Test {
    public static void main(String[] args) {
        List<Item> l = Arrays.asList(
                new Item(1, "Screw"),
                new Item(2, "Nail"),
                new Item(3, "Bolt")
        );

        l.stream()
//INSERT CODE HERE
                //.sorted((a, b)->a.getId().compareTo(b.getId()))
                //.sorted((a, b)->a.getName().compareTo(b.getName()))
                .map((i)->i.getName()).sorted()
                .forEach(System.out::print);
    }
}