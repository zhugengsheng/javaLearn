package javaCode.three;

public class Parcel7B {
    public Parcel3.Contents contents(){
        return new Parcel3.Contents(){
            private int i = 11;
            public int value(){
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7B parcel7B = new Parcel7B();
        Parcel3.Contents contents = parcel7B.contents();
        System.out.println(contents.value());
    }
}
