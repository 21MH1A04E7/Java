import java.util.*;
class Farmer{
    int pa;
    float td;
    static float ri;
    float si;
    static {//memory will allocate only one time
        ri=3.4f;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        pa=sc.nextInt();
        System.out.println("Enter the time duration");
        td=sc.nextFloat();
        // ri=3.4f;
    }
    void calculate(){
        si=(pa*td*ri)/100f;
    }
    void display(){
        System.out.println("Simple interest is "+si);
    }
}

public class StaticKeyword3{
    public static void main(String args[]){
        System.out.println("Main method");
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        f1.input();
        f1.calculate();
        f1.display();

        f2.input();
        f2.calculate();
        f2.display();

    }
}

/*
    principle amount and time duration will be diffent for every one

    //but rate of interest will same for every one
    //better to make it static

    //static methode can call by class
 */