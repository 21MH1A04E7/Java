public class String_Builder_Buffer{
    public static void main(String args[]){
        StringBuilder str=new StringBuilder();
        System.out.println(str.capacity());//inital Capacity is 16
        str.append("abadefghijklmnop");//still capacity will be 16
        str.append("a");
        System.out.println(str.capacity());

        StringBuffer name=new StringBuffer("hariom");
        System.out.println(name.capacity());//16+5
        name.setCharAt(0,'S');
        System.out.println(name);
    }
    /*
     Capacity =>new capacity =>(Capacity+1)*2
     StringBuffer name=new StringBuffer(150);//capacity 150
     trimToSize()//remove extra capacity
     
     StringBuffer and StringBuilder
     StringBuffer is thread safe (synchronized)
     
     StringBuilder is not thread safe
     */
}