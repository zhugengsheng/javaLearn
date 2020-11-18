package Leetcode;

import base.string;

public class test7 {
    public static void swap( int x,  int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap( String x,  String y) {
        String temp = x;
        x = y;
        y = temp;
    }

    public static void swap( student x,  student y) {
        student temp = x;
        x = y;
        y = temp;
        System.out.println(x.toString() +",,,,"+y.toString());
    }

    public static void change( student x,  student y) {
        x.setAge(5);
        y.setAge(9);
        System.out.println(x.toString() +",,,,"+y.toString());
    }

    public static void main(String[] args) {
//        String a = "a", b = "b";
//        swap( a,  b); //值传递
//// a = 10, b = 5;
//        System.out.println(a +","+b);

        student a = new student(1);
        student b = new student(2);
        change(a,b);
        System.out.println(a.toString() +","+b.toString());
    }

}


class student{
    private Integer age;

    public student(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                '}';
    }
}