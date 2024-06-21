class Student{
    private int age;
    private String name;
    Student(String name,int age){
        this(name);//Calling A (Use to Refere current object)
        this.age=age;
        this.name=name;
        System.out.println("Calling C");
    }
    Student(String name){
        this.name=name;
        System.out.println("Calling A");
    }
    Student(int age){
        this.age=age;
        System.out.println("Calling B");
    }
    Student(){
        this(10);//Calling B
        System.out.println("non parameterized constructor");
    }
    public void show(){
        System.out.println(age+" "+name);
    }
}
public class ThisKeyword{
    public static void main(String args[]){
        Student st=new Student();
        st.show();
        Student st2=new Student("hariom",19);
    }
}
/*
 Super() vs this()
    1.The first line inside the constructor can be super()/ this().
    2.If we are not writing anything then compiler will generate super().
    
    //The this keyword refers to the current object in a method or constructor (class).
    //it use to call the current object constructor

    //The super keyword refers to the parent class (variable or constructor)
 */