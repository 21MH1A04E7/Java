class Student1{
    private String name;
    private int age;
    Student1(){

    }
    //Constructor overloading
    //parameterized constructor
    Student1(String name){
        this.name=name;
    }
    Student1(int age){
        this.age=age;
    }
    Student1(String name,int age){
        this.name="hariom";
        this.age=30;
    }
    //Encapsulation
    public void setName(String name){
        this.name=name;
    }
    public void setAge(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println(name+" "+age);
    }
}
public class Constructor1{
    public static void main(String args[]){
        Student1 st=new Student1("hariom",120);
        Student1 st2=new Student1("hi");
        st2.display();
        st2.setName("sujit");
        st2.display();
        st.display();
    }
}
/*
 // A constructor in Java is a special method that is used to initialize objects. 
 //A Constructor is a block of codes similar to the method. It is called when an 
 instance of the class is created. At the time of calling the constructor, 
 memory for the object is allocated in the memory

// Parameterized Constructor:-
// - A constructor that takes some parameters is known as parameterized constructor.
// - The parameterized constructor is used to provide different values to different objects.

// Default Constructor:-
// - A normal constructor is known as the default constructor.
// - If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
// - The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.


note:

by default every constructor have super() keyword in first line
 */