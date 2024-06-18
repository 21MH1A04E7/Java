class Test{
    //Instance Variable
    int a=3;
    String name="hariom";
    public static void main(String args[]){
        System.out.println("hariom");
        int b=3;//primitive
        //create a object
        //Test t=>reference of object
        //new Test() => creation of object (Instance Variable)
        Test t=new Test();
        //accessing the 
        System.out.println(t.a);
        System.out.println(t.name);
    }
}

/*
 * type of Variables
 * 1 Instance Variables
 * 2 Static Variables
 * 3 Local Variables
 * 
 * #Instance Variables
 * i) Instance variables will be created at the time of object creation and destroyed at the time of object
    destruction hence the scope of instance variables is exactly the same as scope of objects.
   ii) Instance variables will be stored on the heap as the part of the object.
   iii) Instance variables should be declared within the class directly but outside of any method or block or
    constructor.

   2) Local varibales
   i) Local variables will be stored inside the stack.
   ii) The local variables will be created as part of the block execution in which it is declared and
    destroyed once that block execution completes. Hence the scope of the local variables is exactly the
    same as the scope of the block in which we declared.
    iii) default value in not present in local variable it will show the error
 */