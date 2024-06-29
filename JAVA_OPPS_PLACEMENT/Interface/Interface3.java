interface Computer{
    void compilecode();
    //we can define the method using dfault or static keywork after  java8 version
    default void run(){
        System.out.println("Program is runing");
    }
}
class Laptop implements Computer{
    public void compilecode(){
        System.out.println("u got 5 error");
    }
}
class Desktop implements Computer{
    public void compilecode(){
        System.out.println("u got 5 error,faster");
    }
}
class Developer{
    public void buildapp(Computer d){
        System.out.println("i am developer,i am building add");
        d.compilecode();
        d.run();
    }
}
public class Interface3{
    public static void main(String args[]){
        Computer obj=new Laptop();
        Developer dev=new Developer();
        dev.buildapp(obj);
    }
}
/*
 * 1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}

Type of interface
1. functional interface
2. normal interface
3. marker interface
 */