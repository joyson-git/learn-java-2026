 abstract  class vechicle{

    public  abstract  void drive();
     public  abstract  void fly();

    public void car(){
        System.out.print("the number is car ----- ");
    }
}
class bike extends vechicle{
    public void fly(){
        System.out.print(" the character--kkkk---");
    }
    public void drive(){
        System.out.print(" the character--jjjj---");
    }
}
public class abstractone {

    public static  void main(String[] args){
vechicle obo = new bike();
obo.fly();
    }
}
