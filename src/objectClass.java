// type casting
class a{
    public  void show1(){
        System.out.print(" the number is first");
    }
}
class b extends a{
    public  void show2(){
        System.out.print(" the number is ");
    }
}

public class objectClass {
    public static void main(String[] args){
a n = (a) new b();
n.show1();
    }
}
