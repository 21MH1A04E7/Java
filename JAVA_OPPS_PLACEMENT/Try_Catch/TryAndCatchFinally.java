import java.util.Scanner;
public class TryAndCatchFinally{
    public static void main(String args[]){
        int num=0;
        Scanner sc=new Scanner(System.in);
        try{
            int result=sc.nextInt();
        }catch(Exception  e){
            System.out.println("Pls Enter number");
        }finally{
            sc.close();
            System.out.println("resource close");
            System.out.println("Finally block");
        }
    }
}