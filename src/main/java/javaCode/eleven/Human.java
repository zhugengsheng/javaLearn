package javaCode.eleven;

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}
class Sneeze1 extends Annoyance{}
public class Human {
    public static void main(String[] args) {
        int i =2;
        try {
            if ( i == 1){
                throw new Sneeze1();
            }else {
                throw new Sneeze();
            }
        }catch (Sneeze s){
            System.out.println("Caught Sneeze");
        }catch (Annoyance a){
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        }catch (Annoyance s){
            System.out.println("Caught Annoyances");
        }

    }
}
