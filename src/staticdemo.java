//encapsulation
class Human{
 private  int age ;
    private  String name ;

    public int getAge(){
     return  age ;
    }
    public String getName(){
        return  name;
    }

    public  void setAge(int a){
        age = a;
    }
    public  void setName(String b){
        name = b;
    }
}

public class staticdemo {
    public  static  void main(String[] args){
        Human obj = new Human();
        obj.setName("joyson");
        obj.setAge(9);
        System.out.print(obj.getName()+" "+obj.getAge());

    }
}
