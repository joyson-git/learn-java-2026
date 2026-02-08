class Animals{
    private String name;
    private int age;

   public String getName(){
       return name;
   }
   public  void setName(String nameobj){

       this.name  = nameobj;
   }
    public int getAge(){
        return age;
    }
    public  void setAge(int Ageobj){

       this.age = Ageobj;
    }
}

public class thiskeyword {
    public  static  void main(String[] args){
Animals ne = new Animals();
ne.setName("ravi");
ne.setAge(89);

System.out.print(ne.getName()+" "+ne.getAge());
    }
}
