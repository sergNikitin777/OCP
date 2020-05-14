package ethuware.stest5.test3;

class SpecialPicker<K>{
    public K pickOne(K k1, K k2){
        return k1.hashCode()>k2.hashCode()?k1:k2;
    }
}

public class TestClass {
    public static void main(String[] args) {
        SpecialPicker<Integer> sp = new SpecialPicker<>(); //1
        System.out.println(sp.pickOne(1, 2).intValue()+1); //2
    }
}
