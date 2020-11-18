package javaCode.three;

public class Wind extends Instrument{
    public void play(){
        System.out.println("Wind");
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }


}

class Instrument{
    public void play(){
        System.out.println("Instrument");
    }

    static void tune(Instrument i ){
        i.play();
    }
}
