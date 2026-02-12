 abstract  class NN{
    public  abstract void car();
}

//class AB extends NN{
//    public  void car(){
//System.out.print(" the t");
//    }
//}

public class anomoyclass {
    public static void main(String[] args) {
     NN np = new NN() {
         public void car() {
             System.out.print(" the number element");
         }
     };

       np.car();

}
}
