public class AnonymousObject {
    public static void main(String args[]){
        //anonymousObject
        new A();
        //anonymousObject has no reference
    }
}
class A{
    public A(){
        System.out.println("object printing");
    }
}
