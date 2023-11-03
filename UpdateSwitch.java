import java.util.Scanner;

public class UpdateSwitch {
    public static void main(String args[]){
        //we can give the input as string in switch
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();//value to switch
        //we can return the value by switch statement
        switch(a){
            case 1->System.out.println("one");
            case 2->System.out.println("two");
            case 3->System.out.println("three");
            case 4->System.out.println("four");
            case 5->System.out.println("five");
            default->System.out.println("out of range");
        }
        //instead of using arrow we can use the colon
        //syntax (we need to use the yied key)
        //case 1:yied
    }
}
