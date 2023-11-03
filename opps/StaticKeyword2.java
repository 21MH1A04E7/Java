package opps;

public class StaticKeyword2 {
    public static void main(String args[]){
        Mobile mb=new Mobile();
        mb.brand="vivo t1";
        mb.company="vivo";
        Mobile.name="smartphonw";
        mb.get();
        mb.getting(mb);
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
    //this is static method 
    //in static method we can call only static variable
    public static void get(){
        System.out.println(" : "+name);
    }
    
    //but we can call the non-static variable by class object
    public static void getting(Mobile obj){
        System.out.println(obj.brand+" : "+obj.company+" : "+name);
        //name is static variable
    }
}