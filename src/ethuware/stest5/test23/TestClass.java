package ethuware.stest5.test23;

import java.util.ArrayList;
import java.util.Collections;

class Address implements Comparable<Address>{
    String street;
    String zip;
    public Address(String street, String zip){
        this.street = street; this.zip = zip;
    }
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0? this.street.compareTo(o.street) : x;
    }
}
public class TestClass {
    public static void main(String[] args) {
        ArrayList<Address> al = new ArrayList<>();
        al.add(new Address("dupont dr", "28217"));
        al.add(new Address("sharview cir", "28217"));
        al.add(new Address("yorkmont ridge ln", "11223"));
        Collections.sort(al);
        for(Address a : al) System.out.println(a.street+" "+ a.zip);
    }
}
