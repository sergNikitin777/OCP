package ethuware.advclassdesign.test7;

class OuterWorld
{
    public InnerPeace i = new InnerPeace();
    private class InnerPeace
    {
        private String reason = "none";
    }

    String m(){
       return i.reason;
    }

    public static void main(String[] args) {
        OuterWorld outerWorld = new OuterWorld();
        System.out.println(outerWorld.m());
    }
}