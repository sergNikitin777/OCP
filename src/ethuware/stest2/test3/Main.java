package ethuware.stest2.test3;

import java.io.FileNotFoundException;
import java.io.IOException;

interface I1
{
    void m1() throws java.io.IOException;
}
interface I2
{
    void m1() throws java.io.FileNotFoundException;
}

public class Main implements I1,I2 {
    @Override
    public void m1() throws FileNotFoundException{

    }
}
