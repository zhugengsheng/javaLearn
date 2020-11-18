package javaCode.three;

public class Parcel3 {
    static class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

     class Destination{
        private String lable = "aaa";
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        Contents contents = new Parcel3.Contents();
        System.out.println(contents.i);

        Destination destination = parcel3.new Destination();
        System.out.println(destination.lable);
    }
}
