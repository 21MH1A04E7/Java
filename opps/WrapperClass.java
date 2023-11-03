public class WrapperClass {
    public static void main(String args[]){
        int num=7;
        // Integer num1=new Integer(8);//boxing 
        Integer num1=8;
        int num2=num1;//auto boxing
        System.out.println(num1);
        System.out.println(num2);
        String str="12";
        //converting string to integer
        int num3=Integer.parseInt(str);

        // double num3=Double.parseDouble(str);
        System.out.println(num3*2);
    }
}
//in java every perimitive type we have a class for it
//int ->Integer(Class) 
//char ->Character
//double ->Double
