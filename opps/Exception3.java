public class Exception3 {
    public static void main(String args[]){
        System.out.println("Exception");
    }
}
// #Important points
// -- Every class extends Object class so, Throwable class by default extends Object
// -- The top-level class in the Java exception hierarchy is the Throwable class. All exception classes in Java are subclasses of the Throwable class.
// -- The Throwable class has two subclasses: Error and Exception. 
// -- The Error class represents serious errors that cannot be handled by the program, such as OutOfMemoryError or StackOverflowError.
// -- The Exception class represents exceptions that can be caught and handled by the program.
// -- The Exception class has many subclasses that represent specific types of exceptions. Some common subclasses of Exception include RuntimeException, IOException, SQLException, and NullPointerException.
// -- Exception classes in Java can be either checked or unchecked.

// Checked Exception:
// Checked exceptions are those that are checked at compile-time, meaning the compiler ensures that the programmer handles the exception by either catching or declaring it in the method signature using the throws keyword. 
// Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

// UnChecked Exception:
// unchecked exceptions are not checked at compile-time, and the compiler does not force the programmer to handle them. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and
// ArithmeticException.