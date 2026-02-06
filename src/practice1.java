//public class practice1 {
//
//    public void newMethod(){
//        System.out.println(" hello world");
//    }
//     public static void main(String[] args){
//         practice1 k = new practice1();
//     k.newMethod();
//     }
//
//}

class  Person{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){ return  name;}
}

public  class practice1 {
    public static  void main(String[] args){

        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); // Error: 'name'
        // has private access
        System.out.println(p.getName());
    }
}
