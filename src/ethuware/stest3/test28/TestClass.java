package ethuware.stest3.test28;

interface I { }

 enum EnumA implements I { A, AA, AAA};  //1


public class TestClass
{
    public enum EnumB{ B, BB, BBB;
        //public Object clone(){ return B; } //2  compile error
    }

    public static enum EnumC{ C, CC, CCC };

    //public static enum EnumD extends EnumC{ DDD }; //3 compile error

    public TestClass()
    {
        //System.out.println(EnumC.CC.index()); //4  compile error
    }


    public static void main(String[] args)
    {
        System.out.println(EnumC.valueOf("ccc")); //5 runtime Exception
        System.out.println(EnumC.CCC.name()); //6
    }
}