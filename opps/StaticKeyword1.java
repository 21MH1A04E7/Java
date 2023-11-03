package opps;

public class StaticKeyword1 {
   public static void main(String args[]){
     Mobile obj1=new Mobile();
     obj1.brand="vivo t1";
     obj1.company="vivo";
     //static keyword we can acess by class
     Mobile.name="smartphone";

     Mobile obj2=new Mobile();
     obj2.brand="iphone max";
     obj2.company="apple";
    
     
     obj1.print();
     obj2.print();
     
   }
}
class Mobile{
    String brand;
    String company;
    //static keyword
    static String name;
    public void print(){
        System.out.println(brand+" : "+company+" : "+name);
    }
}
// when we are using static keyword with variable, block, method it become
// independent of object. 