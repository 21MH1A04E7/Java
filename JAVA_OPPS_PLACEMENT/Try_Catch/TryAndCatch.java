public class TryAndCatch{
    public static void main(String args[]){
        int num1=10;
        int num2=0;
       try{
        int result=num1/num2;
       }catch(Exception e){
        System.out.println("zero divide");
       }
    }
}

/*
 *Java Try Catch Block
 * In Java exception is an “unwanted or unexpected event”, 
 * that occurs during the execution of the program. 
 * When an exception occurs, the execution of the program 
 * gets terminated. To avoid these termination conditions 
 * we can use try catch block in Java
 */