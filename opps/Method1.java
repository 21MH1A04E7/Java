package opps;

public class Method1 {
    
    public static void main(String args[]){
        //Person();here default constructor is calling
        Person p1=new Person();
        p1.name="hariom";
        p1.age=20;
        p1.walk();
        p1.walk(45);
    }
}
class Person{
    String name;
    int age;
    void walk(){
        System.out.println(name+" is walking");
    }
    void walk(int step){
        System.out.println(name+" is walking "+step+" steps");
    }
}

