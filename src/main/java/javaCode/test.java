package javaCode;

import java.util.*;


public class test {
    private int id;
    private int fenshu;

    public test(int id, int fenshu) {
        this.id = id;
        this.fenshu = fenshu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFenshu() {
        return fenshu;
    }

    public void setFenshu(int fenshu) {
        this.fenshu = fenshu;
    }

    public static void main(String[] args) {
        List<test> list = new ArrayList<>();
        list.add(new test(1,6));
        list.add(new test(2,2));
        list.add(new test(3,3));
        Collections.sort(list, (Comparator) (t1, t2) -> {
            test o1 = (test) t1;
            test o2 = (test) t2;
            return o1.getFenshu()-o2.getFenshu();
        });
        for (test a:list
             ) {
            System.out.println(a.getId() + ":" +a.getFenshu());
        }
    }
}
