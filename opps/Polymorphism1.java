package opps;

public class Polymorphism1 {
    public static void main(String args[]){
        College obj1=new College();
        obj1.name="hariom";
        obj1.rollno=23;
        // System.out.println(obj1.name);
        College obj2=new College();
        obj2.name="sujit";
        obj2.rollno=452;
        //calling method
        obj2.print();
        //
        obj2.print(obj2.name);

        //calling method with argument name and rollno
        obj1.print(obj1.name,obj1.rollno);
    }
}
class College{
    String name;
    int rollno;
    static int count=0;
    //method overloading
    //method overloading is compile time polymorphism
    //compile time poymorphism
    public void print(){
        System.out.println("hi hariom");
    }
    public void print(String name){
        System.out.println("your name is "+name);
    }
    public void print(String name,int rollno){
        System.out.println("your name is "+name+" and your roll no is "+rollno);
    }
}
//note *
//there are two of polymorphism
//1. compile time polymorphism (method overloading)
//2. run time polymorphism (method overriding)