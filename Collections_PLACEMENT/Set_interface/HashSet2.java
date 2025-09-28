import java.util.*;

class Student{
    String name;
    int age;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Student student=(Student)o;
        return age==student.age;
    }
    @Override
    public int hashCode(){
        return Objects.hash(age);
    }
    @Override
    public String toString(){
        return "Name: "+name+", Age: "+age;
    }
}
public class HashSet2{
    public static void main(String args[]){
        Set<Student> st=new HashSet<>();
        st.add(new Student(18,"hariom"));
        st.add(new Student(19,"ramesh"));
        st.add(new Student(18,"hariom"));

        System.out.println(st);
        for(Student item:st){
            System.out.println(item.name);
            System.out.println(item.age);
        }

    }
}