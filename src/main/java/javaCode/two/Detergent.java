package javaCode.two;

import javaCode.three.Cleanser;

import java.lang.reflect.Field;

public class Detergent extends Cleanser {
    private int i = 0;
    public void scrub(){
        String a =s1;
//        String a2 =;
//        super.app
    }

    public Detergent() {
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Detergent detergent = new Detergent();
        Class<? extends Detergent> aClass = detergent.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
//        if (declaredFields[0] instanceof String) {
//            System.out.println("yes");
//        }

//        Class<?> cl = Class.forName("javaCode.three.Cleanser.Detergent.class");
        String s = aClass.getName().toUpperCase();
        System.out.println(s);
    }
}
