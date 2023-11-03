public class Interface1 {
    public static void main(String args[]){
        Laptop lap=new Laptop();
        Developer dev=new Developer();
        dev.devApp(lap);
    }
}
class Laptop{
    public void code(){
        System.out.println("I am a laptop");
    }
}
class Developer{
    public void devApp(Laptop obj){//passing object of laptop class
        System.out.println("i am developer");
        //calling code method
        obj.code();
    }
}