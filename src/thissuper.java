class A{
    public A(){
        super();
        System.out.println(" the number is A default");
    }
    public A(int a , int b){
        super();
        System.out.println(" the number A parameter");
    }
}
class B extends A{ // inheritance

    public B(){
       super();
      //  this();
        System.out.println(" the number B default");
    }
    public B(int a , int b){
       // super();
        this();
        System.out.println(" the number B parameter");
    }

}

public class thissuper {
   public  static  void main(String[] args){
    //   B n = new B();
       B d = new B(20,90);
    //   System.out.print(n);
   }
}
