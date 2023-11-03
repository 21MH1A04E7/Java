public class Exceptions2 {
    public static void main(String args[]){
        int i=2;//i=0 
        int j=0;
        int[] arr=new int[5];
        String str=null;
        try{
            //18/0 error
            j=18/i;//first it will executed this block 
            System.out.println(arr[4]);// arr[5] then this block (Array Bound Exception)
            System.out.println(str.length());//this is an exception
        }
        //this catch block is handling ArithmeticExceptio
        catch(ArithmeticException e){
            System.out.println("can't divided by zero");//java.lang.ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound exception");
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("hi how r you");
    }
}
