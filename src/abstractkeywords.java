 abstract  class Car{

    public abstract void brand();
      //  System.out.println(" the color is brand");

    public void color(){
        System.out.println(" the color is red");
    }

}

class bmw  extends Car{
    public void brand(){
        System.out.print(" the bmw is good car");
    }
}

public class abstractkeywords {
    public static void main(String[] args){
 Car c = new bmw();
 c.brand();
 c.color();
    }
}

//abstract class dont have object
