package opps;

public class MethodOverriding1 {
    public static void main(String args[]){
        // A obj1=new A();
        // obj1.show();
        B obj2 = new B();
        obj2.show();
        A clA=new A();
        int add1=clA.cal(3,4);
        System.out.println(add1);

        //
        B clB=new B();
        int add2=clB.cal(3,4);
        System.out.println(add2);
    }
}
class A{
    public void show(){
        System.out.println("show for A");
    }
    public int cal(int a,int b){
        return a+b;
    }
}
class B extends A{
    //method overrring 
    @Override public void show(){
        System.out.println("show for B");
    }
    @Override public int cal(int a,int b){
        return a+b+1;
    }
}
// for a method to be overriding, the following conditions must be met:

//  -- The method in the subclass must have the same signature (name, number and type of parameters) as the method in the superclass.
 
//  -- The method in the subclass must have the same return type (or a subtype) as the method in the superclass.

//  -- The method in the subclass must have the same access level (public, protected, or private) as the method in the superclass.

//  -- The method in the subclass must not be static, while the method in the superclass must be marked as non-final.

//  -- The overridden method must be visible from the subclass it means you can change access modifiers but there is condition for 
//     -- you need to increase visibility but you cannot reduced it , you can do it using access modifiers.
//     -- you can change access modifiers in this manner 
//        private -default -protected -public (in upcoming lecture access modifiers has been discussed)
