package javaCode.two;

public class Flower {
    int petalCount = 0;
    String s = "init value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("constructor int. petalCount = " + petals);
    }

    Flower(String ss){
        System.out.println("constructor String. s = " + ss);
        s = ss;
    }

    Flower(int petals, String s){
        this(petals);  //must first
//        this(s);  //can't call two!!
        this.s = s;
        System.out.println("base.string & int args");
    }

    Flower(){
        this(4,"hi");
        System.out.println("default no args constructor");
    }

    void printPetalCount(){
//        this(22); //除构造器外，编译器禁止在其他任何方法中调用构造器！！！！
        System.out.println(petalCount + "  " + s );
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }
}
