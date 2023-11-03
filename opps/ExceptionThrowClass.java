public class ExceptionThrowClass {
    public static void main(String args[]){
        int i=25;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new HariomException("this is hariom class exception");
            }
        }
        catch(HariomException e){
            j=18/1;
            System.out.println("thats the default output"+e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("BYE");
    }
}
//we can extends from Exception and RunTimeException
class HariomException extends Exception{//creating own exception
    public HariomException(String str){//constructor
        super(str);//calling super class constructor
    }
}

