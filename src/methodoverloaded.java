//overloading
 class overloading{
    public void add(int a , int b){
        System.out.print(" the number is 20"+(a+b));
    }
    public void add(double a , double b){
        System.out.print(" the number is 20"+(a+b));
    }
    public void add(short a , short b){
        System.out.print(" the number is 20"+(a+b));
    }
}
public class methodoverloaded {
    public static  void main(String[] args){
overloading n = new overloading();
       n.add(3.3,4.8);
    }
}
