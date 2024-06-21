
class Mobile{
    static int a;
    static int b;
    int n;
    int m;
    static{//memory will allocate only one time
        System.out.println("Static Block");
        a=4;
        b=5;
    }
    {//memory will allocate in heap area for every object
        System.out.println("non static Block");
        n=10;
        m=20;
    }
}
public class StaticKeyword4{
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
    }
}