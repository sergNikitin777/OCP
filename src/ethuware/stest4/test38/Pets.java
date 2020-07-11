package ethuware.stest4.test38;

//in file Pets.java
//enum Pets
//{
//    DOG("D"), CAT("C"), FISH("F");
//    String name;
//    Pets(String s) { }
//    public String getData(){ return name; }
//}

//enum Pets
//{
//    DOG("D"), CAT("C"), FISH("F");
//    static String prefix = "I am ";
//    String name;
//    Pets(String s) { name = prefix + s;}
//    public String getData(){ return name; }
//}

//in file Pets.java
//public enum Pets
//{
//    DOG(1, "D"),
//    CAT(2, "C")
//            {
//                public String getData(){ return type+name; }
//            },
//    FISH(3, "F");
//    int type;
//    String name;
//    Pets(int t, String s) { this.name = s; this.type = t;}
//    public String getData(){ return name+type; }
//}

//in file Pets.java
//enum Pets
//{
//     String name;
//    DOG("D"), CAT("C"), FISH("F");
//    Pets(String s) { name = s;}
//    }