public class Interface2 {
    public static void main(String args[]){
        Computer lap=new Laptop();
        Computer des=new Desktop();
        Developer obj=new Developer();
        //passing object of Desktop class
        obj.devApp(des);
        //passing object of Laptop class
        obj.devApp(lap);    
    }
}
 abstract class Computer{
    // public void code(){

    // }
    //simply we can declear it
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("I am a laptop");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("I am a Desktop");
    }
}
class Developer{
    //taking interface of computer class
    public void devApp(Computer obj){
        System.out.println("i am developer");
        obj.code();
    }
}
// - We can also pass an object as a parameter in a method.
// - When you build an application, you need to make it more flexible.
// - We can create a reference of the parent class and an object of the sub-class.
// - Passing reference and the reference of an object that you accept in a method, both should be the same.

// #2 
// Interface:-
// - Interface in Java is used to achieve abstraction.
// - Interface is used to design an application to make it loosely coupled.
// - implements keyword is used with a class to extend it to an interface
//  interface Computer