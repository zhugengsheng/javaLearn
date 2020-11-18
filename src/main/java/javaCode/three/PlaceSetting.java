package javaCode.three;

public class PlaceSetting {
    private Plate plate;
    private Utensil utensil;

    public PlaceSetting(int i){
        utensil = new Utensil(1);
        plate = new Plate(1);
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(1);
    }
}

class Plate{
    Plate(int i){
        System.out.println("plate constructor");
    }
}

class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("utensil constructor");
    }
}

class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon constructor");
    }
}