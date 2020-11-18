package javaCode.three;

public class MultiImplementation {
    static void takesD(D d){}
    static void takesE(E e){}

    public static void main(String[] args) {
        Z z = new Z();
        new Z.EE();
        z.new DD();
    }
}

class D{}
abstract class E{}
class Z extends D{
    static class EE{}
    class DD{}
    E makeE(){
        return new E(){};
    }
}