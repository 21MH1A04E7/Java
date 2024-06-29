class Car{
    //Method Overloading
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,double b){
        //different parameter
        System.out.println(a+b);
    }
}
public class MethodeOverLoading1{
    public static void main(String args[]){
        Car c = new Car();
        c.add(7,4);
        c.add(7,0.1);
        c.add(3,4,5);
    }
}

/*
 Methode Overloading
 In Java, Method Overloading allows different methods to have the same name, 
 but different signatures where the signature can differ by the number of input 
 parameters or type of input parameters, or a mixture of both.

 Different Ways of Method Overloading in Java
    Changing the Number of Parameters.
    Changing Data Types of the Arguments.
    Changing the Order of the Parameters of Methods
 */