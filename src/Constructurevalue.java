class Animal{

  private  String color;
  private  String area;
  //construction name
  public  Animal(){
System.out.print(" constructer---------");
color = " reed";
//construct name should be same has class name ,
      //it dont have have any return statment
      //if we create the object , new construct is created

  }
  public String getColor(){
      return color;
  }
  public void setColor(String color){
      this.color = color;
  }
}

public class Constructurevalue {

    public  static  void main(String[] args){
Animal animals = new Animal();
//animals.setColor("red");
System.out.print(animals.getColor());
    }
}
