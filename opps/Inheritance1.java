public class Inheritance1 {
    public static void main(String args[]){
        AdvCal obj1=new AdvCal();
        System.out.println(obj1.multi(2,5));
        //
        System.out.println(obj1.add(5,4));
    }
}
class Cal{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
//inheritance (inherit the class Cal in class Advcal)
//this class will gain all the property of Cal class
class AdvCal extends Cal{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
// The main aim of inheritance is to implement the concept of reusability,
//  saving our time and resources and also creating better connections between different classes, and achieving method overriding. 
