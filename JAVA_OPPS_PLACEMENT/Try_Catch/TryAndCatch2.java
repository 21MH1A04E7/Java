public class TryAndCatch2{
    public static void main(String args[]){
        int num1=10;
        int num2=4;
        int value[]={4,5,6,7};
        try{
            int result=num1/num2;
            System.out.println("Array value "+value[4]);
            System.out.println("result "+result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Excepiton");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}