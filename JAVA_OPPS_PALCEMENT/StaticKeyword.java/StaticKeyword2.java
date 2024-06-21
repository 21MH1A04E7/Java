
class Demo{
    static int a;
    static int b;
    int n;
    int m;
    static {
        System.out.println("Control in staitc block");
        a=20;
        b=10;
    }

    {
        System.out.println("Control in non static block");
        n=5;
        m=7;
    }

    static void dis(){
        System.out.println("value of static a is "+a);
        System.out.println("value of static b is "+b);
        // System.out.println("value of static b is "+m);//we can't call the non static member in side the static member
    }

    void dis2(){
        System.out.println("value of non static m is"+m);
        System.out.println("value of non static n is"+n);
    }

}
public class StaticKeyword2{
    public static void main(String args[]){
        Demo d1=new Demo();
        Demo.dis();
        d1.dis2();
    }
}

/*
 static member contain only static member 
 */