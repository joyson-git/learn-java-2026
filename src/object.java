class Calculate{

    public int add(int a,int b){
        int result = a+b;
        return result;
    }
}

public class object {

    public static void main(String[] args){
        int a = 20;
        int b = 30;
      //  add(a+b);
        Calculate cal = new Calculate();
     int result =  cal.add(a,b);
        System.out.print(result);
    }

}
