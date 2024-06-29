class Human1{
    int age;
    Human1(){
        System.out.println("Human1 constructor");
    }
    public void sleep(){
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1{
    int b;
    // Student1(){//behind the sinces
    //     super()//by default calling the super class constructor
    // }
    public void show(){
        System.out.println("Student1 class");
    }
}
public class Inheritance1{
    public static void main(String args[]){
        System.out.println("hariom");
        Student1 s=new Student1();
        s.age=2;
        s.sleep();
    }
}
/*
     It is the mechanism in Java by which one class is allowed to inherit the 
     features(fields and methods) of another class. 

     //Construtor will not inherit for subclass 

     //access modifer
 */