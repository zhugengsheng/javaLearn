package javaCode.three;

public class Cleanser {
    private String s = "cleanser";
    protected String s1 = "aa";
    String s3 = "s3";
    public void append(String a){
        s += a;

    }

    private void apply(){
        append("apply()");
    }

    protected void apply1(){
        append("apply1()");
    }

    void apply2(){
        append("apply2()");
    }
}
