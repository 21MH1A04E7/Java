public class TypeCasting {
    public static void main(String args[]){
        //type casting 
        double num=3.6;
        int num2=(int)num;
        System.out.println(num2);
        //upCasting 
        //object is B but refer to B
        // A obj=(A)new B();
        // obj.show1();
        
        A obj2=new B();
        // obj2.show2(); //we will get error
        obj2.show1();
        //here obj2 is reference of A but object of so we can do the type casting
        //this is downCasting
        B obj3=(B)obj2;
        obj3.show2();
    }
}
class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}
