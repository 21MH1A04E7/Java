public class StaticKeyword1{
    static int a;
    static//it will executed at the time of class loading
    {
        System.out.println("Static Block");
        a=10;
        System.out.println(a);
    }
    public static void main(String args[]){
        System.out.println("Main method");
    }
}

/*
'static' keyword
    1)The static keyword is mainly used for memory management in Java.
    2)A static keyword can be applied with variables, blocks, functions and class.
    3)The static keyword is a property of a class rather than an instance of the class.
    4)The static keyword is used for a constant variable or a method that is the same for every instance of a class.

    keyword
    The static keyword is a non access modifier in java which is applicable for the 
    1 varibales
    2 methods
    3 blocks
    4 nested class (classes)
 */