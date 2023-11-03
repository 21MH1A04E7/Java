import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally3 {
    public static void main(String args[]) throws NumberFormatException,IOException{
        int num=0;
          try(BufferedReader br=new BufferedReader( new InputStreamReader(System.in))) {
               System.out.println("Enter your number:");
               // read a line of text from the BufferedReader
               num = Integer.parseInt(br.readLine());
               System.out.println("Hello, " + num+ "!");
           }  
    }
}
 