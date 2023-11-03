public class Exception1 {
    public static void main(String args[]){
        int i=0;
        int j=0;
        //if there are any error then skip this block and execute the remaining part
        try{
            j=18/i;
        }
        //Exception is a class
        //catch block executed only in the case of exception
        catch (Exception e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
