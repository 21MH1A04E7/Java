public class DuckingException1 {
    public static void main(String args[]){
        A obj=new A();
        obj.show();//this method will handeling  the exception
    }
}
class A{
    public void show(){
        try{
            Class.forName("Demo");//finding the class
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find this class");
        }
        System.out.println("BYE");
    }
}