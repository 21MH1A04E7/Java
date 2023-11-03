package opps;

public class Encapsulation {
    public static void main(String args[]){
        Person p1=new Person();
        p1.setname("hariom");
        p1.setage(19);
        System.out.println(p1.getname()+" : "+p1.getage());
        Person p2=new Person();
        p2.setname("sujit");
        p2.setage(16);
        System.out.println(p2.getname()+" : "+p2.getage());
    }
}
class Person{
    private String name;
    //private keyword we can acess only inside of class
    private int age;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        //this keyword indicate the current object data
        this.age=age;
    }
    public int getage(){
        return age;
    }
}
// What is encapsulation?
// = binding data with method to make your program secure is known as encapsulation.
// Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.

// how to achieve encapsulation?
// -- through access specifiers private,protected,public,default . We can achieve 
// encapsulation.

// Benefit of encapsulation
//  i)Helpful in to achieve abstraction 
//  ii)for security point of view it is most beneficial.
//  iii)you can maintain log file through method when you bind your data with method.