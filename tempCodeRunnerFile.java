import java.util.Scanner;

public class Switch{
    public static void main(String args[]){
        //old switch method in java
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//value to switch
        switch(a){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            default:
            System.out.println("out of range");
        }
    }
}
