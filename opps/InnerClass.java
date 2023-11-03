public class InnerClass {
    public static void main(String args[]){
        OuterClass obj=new OuterClass();
        obj.show();
        //this is inner class of outerClass
        //if we need to create object of Inner we need to create object outerClass
        OuterClass.Inner obj1=obj.new Inner();
        //  OuterClass.Inner obj1=new OuterClass.Inner(); //only for static class   
        obj1.config();
    }
}
class OuterClass{
    int age;
    public void show(){
        System.out.println("A show");
    }
    class Inner{
        public void config(){
            System.out.println("in config");
        }
    }
}
