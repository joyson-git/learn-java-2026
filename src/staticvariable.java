class test{
    static int a = 79;
}

class test2{
    static void show1(){
        System.out.print(" the number");
    }
}

public class staticvariable {
    public static void main(String[] args){
test n = new test();
//test2 no = new test2();
test2.show1();
System.out.print(n.a);
    }
}
