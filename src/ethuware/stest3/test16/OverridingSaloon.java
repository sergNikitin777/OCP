package ethuware.stest3.test16;

abstract class Saloon{
    protected int m1(){ return 0; }
}

public class OverridingSaloon extends Saloon{
    public int m1(){ return 1; }

}