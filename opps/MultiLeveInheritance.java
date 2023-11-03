import java.util.*;
public class MultiLeveInheritance {
    public static void main(String args[]){
        VeryAdvCal obj=new VeryAdvCal();
        //power
        System.out.println(obj.power(4,2));
        //addition
        System.out.println(obj.add(4,2));
        //multiplication
        System.out.println(obj.multi(7, 8));
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
class AdvCal extends Cal{
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
class VeryAdvCal extends AdvCal{
    public int power(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
}
//java don't have multiple inheritance