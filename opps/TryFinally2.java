import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally2 {
    public static void main(String args[]) throws NumberFormatException,IOException {
        BufferedReader br = null;
          try {
               // create a new InputStreamReader to read from System.in
               InputStreamReader isr = new InputStreamReader(System.in);
               // create a new BufferedReader to read from the InputStreamReader
               br = new BufferedReader(isr);
   
               System.out.println("Enter your name:");
               // read a line of text from the BufferedReader
               String name = br.readLine();
   
               System.out.println("Hello, " + name + "!");
           }  
        finally{  
            if(br!=null)
             br.close();   //finally used to close the resources  regardless Excpetion occur or not  
        }
    }
}
