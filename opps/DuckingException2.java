public class DuckingException2 {
     static{
            System.out.println("BYE");
        }
    public static void main(String args[]) /*throws ClassNotFoundException*/{
       A obj=new A();
       try{
        obj.show();
       }
       catch(ClassNotFoundException e){
            e.printStackTrace();
       }
    }
}
class A {
    public void show() throws ClassNotFoundException{//this class not handling the exceptions
        Class.forName("Demo");//finding the class
    }
}