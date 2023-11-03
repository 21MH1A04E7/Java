import java.util.Scanner;

public class UpdateSwitch1 {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//value to switch
        //we can return the value by switch statement
        String name=switch(a){
            case 1->"one";
            case 2->"two";
            case 3->"three";
            case 4->"four";
            case 5->"five";
            default->"out of range";
        };// important we need to give the colom (at the end of switch statement)
        System.out.println(name);
        //instead of using arrow we can use the colon
        //syntax (we need to use the yied key)
        //case 1:yied
    }
}
