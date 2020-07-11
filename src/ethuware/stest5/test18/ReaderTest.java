package ethuware.stest5.test18;

interface Classic {
    int version = 1;
    public void read() ;
}

class MediaReader implements Classic{
    int version = 2;
    public void read() {

        System.out.println(((Classic)this).version);


    }
}

public class ReaderTest{
    public static void main(String[] args) {
        MediaReader mr = new MediaReader();
        mr.read();
    }
}