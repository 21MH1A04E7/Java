package opps;

public class StaticBlock {
    public static void main(String args[]){
        Mobile mb=new Mobile();
        Mobile mb2=new Mobile();
        mb.brand="vivo t1";
        mb2.brand="vivo x5";
        mb.print();
        mb2.print();
    }
}
class Mobile{
    String brand;
    String company;
    //static keyword
    static String name;
    public Mobile(){
        brand="";
        company="vivo";
        // static it's declearing two times to avoid this (use static block)
        // name="smartphone";
        System.out.println("calling constructor");
    }
    //it call only one times
    //when class is loaded
    static{
        name="smartphone";
        System.out.println("calling block");
    }
    public void print(){
        System.out.println(brand+" : "+company+" : "+name);
    }
}
//  remember static block executed before the execution of static method 
// non static block executed when you try to create the object and executed before constructor called.