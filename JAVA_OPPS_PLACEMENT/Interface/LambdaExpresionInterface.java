interface Home{
    void show();
}
interface Home2{
    void gate(int a);
}
interface Home3{
    void go(int a,int b);
}
public class LambdaExpresionInterface{
    public static void main(String args[]){
        Home home = ()-> System.out.println("Welcome to my home");
        home.show();
        //one parameter
        Home2 home2=(p1)->System.out.println("welcome to my home :get no "+p1);
        home2.gate(5);

        //more than one parameter
        Home3 home3=(p1,p2)->System.out.println("welcome "+p1+" "+p2);
        home3.go(5,6); 
    }
}
/*
 * Lambda expression
 * ()->{....}
 * one parameter
 * p1->{....}
 * more than one paremeter
 * (p1,p2)->{...body..}
 */