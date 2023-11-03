public class Constructor {
    public static void main(String args[]){
        Person p1=new Person();
        Person p2=new Person(17,"mahi");
        System.out.println(p1.name+" : "+p1.age);
        System.out.println(p2.name+" : "+p2.age);
    }
}
class Person{
    int age;
    String name;
    // constructor for the person class
    public Person(){
        System.out.println("calling contructor");
        this.age = 30;
        this.name="hariom";
    }
    //parameterized constructor
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
  
}
// A constructor in Java is a special method that is used to initialize objects. 

// Parameterized Constructor:-
// - A constructor that takes some parameters is known as parameterized constructor.
// - The parameterized constructor is used to provide different values to different objects.

// Default Constructor:-
// - A normal constructor is known as the default constructor.
// - If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
// - The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
