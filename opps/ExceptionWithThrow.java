public class ExceptionWithThrow {
    public static void main(String args[]){
        int i=28;
        int j=0;
        try{
            j=18/i;//getting j=0
            if(j==0){
                throw new ArithmeticException("i don't want to return zero");//passing the message
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("that is default output"+e);
        }
        catch(Exception e){
            System.out.println("Somethin went wrong");
        }
        System.out.println(j);
        System.out.println("BYE");
    }
}
// 1 
// -- throw keyword in Java is used to explicitly throw an exception. 
// When an exception is thrown using the throw keyword, the execution of the current method is stopped.

// syntax-
// throw new NullPointerException("Object is null");

// 2
// - throw keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
// -- if you do not use try-catch then the control is passed, where the method is called.
// -- when you want to pass message to an exception 
// then you should use the parametrized constructor instead non parameterized constructor
