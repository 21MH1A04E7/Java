public class MainClass{
    public static void main(String args[]){
        //creating a object
        //class_name object_name=new class_name();
        Person p1=new Person();
        p1.name="hariom";
        p1.age=20;
        System.out.println(p1.name+"  "+p1.age);
        //created another object
         Person p2=new Person();
        p2.name="Sujit";
        p2.age=17;
        System.out.println(p2.name+"  "+p2.age);

        //acessing the method
        p1.walk();
        
        p2.walk();

    }
}
//creating a class
//class class_name
//class_name should be camel_case
class Person{
    String name;
    int age;
    //methode (property)
    void walk(){
        System.out.println(this.name +" is walking and his age is " +this.age);
    }
    void eat(){
        System.out.println(this.name +"I am eating and his age is "+this.age);
    }
}
//Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
// Class does not occupy memory.
// Class is a group of variables of different data types and a group of methods.
// A Class in Java can contain:
// Data member
// Method
// Constructor
// Nested Class
// Interface