class College{//extends Object class
    public int number;
    public void display(){
        System.out.println(number);
    }
}
class ECE extends College{
    int student=10;
    public void eceShow(){
        System.out.println(student);
    }
}
public class Iheritance2{
    public static void main(String args[]){
        ECE e=new ECE();
        e.display();
        e.eceShow();
    }
}
/*
 Type of Inheritance
 1. Single Inheritance
 2. Multilevel Inheritance
 3. Multiple Inheritance
 4. Hierarchical Inheritance
 
 //Multiple Inheritance is not allow in java
 //subclass can't have multiple parent class

 //Single level Inheritance 1->2
 //Multileve Inheritance 1->2->3->...
 //Hierarchical Inheritance 1->2 or 1->2 or 1->3 ...

 //by default java class extends Object calss if they don't have parent class
 //Object class is a super class of all the classes in java
 
 */