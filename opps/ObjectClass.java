public class ObjectClass {
    public static void main(String args[]){
        A obj=new A();
        obj.x=100;
        //by default it will return the hexadecimal value
        System.out.println(obj.toString());
    }
}
class A{
    int x;
    //here i declear the toString class
    public String toString(){
        return "hey "+x;
    }
}