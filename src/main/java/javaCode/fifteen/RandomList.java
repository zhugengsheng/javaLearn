package javaCode.fifteen;

import javaCode.fourteen.A;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> list = new ArrayList<>();
    private Random rand = new Random();
    public void add(T t){list.add(t);}
    private T select(){
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        randomList.add("aaa");
        randomList.add("bbb");
        randomList.add("ccc");
        for (int i = 0; i < 3; i++) {
            System.out.println(randomList.select());
        }
    }
}
