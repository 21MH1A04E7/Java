public class DuckingException {
    public static void main(String args[]){
        try{
            Class.forName("Demo");//fiding the class
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find this class");
        }
        System.out.println("BYE");
    }
}
