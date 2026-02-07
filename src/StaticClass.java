class Mobile{
    String brand;
 static    String description;


}


public class StaticClass {
    public static  void main(String[] args){
Mobile ne1 = new Mobile();
ne1.brand = " joys";
ne1.description ="hello world";

        System.out.println(ne1.brand+"  "+ne1.description);
        Mobile ne2 = new Mobile();
        ne2.brand = " joysuelll";
        ne2.description ="hello";

System.out.println(ne2.brand+"  "+ne2.description);

//        Mobile ne2 = new Mobile();
//        ne2.brand = " joys";
//        ne2.description ="hello world";



    }
}
