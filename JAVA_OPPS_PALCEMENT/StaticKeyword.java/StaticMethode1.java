
public class StaticMethode1{
    static int a;
    static
    {
        a=5;
        System.out.println("Static Block");
    }
    static void dis(){
        System.out.println("Static methode");
    }
    public static void main(String args[]){
        dis();
    }
}

/*
 static method is not object dependent
 */