public class TryFinally {
    public static void main(String args[]){
        int i=19;
        int j=0;
        try{
            j=19/i;
        }
        catch(Exception e){
            System.out.println("Arthimetic exception");
        }
        finally{//it will always execute
            System.out.println("BYE");
        }
    }
}
// #1 use of try with finally without catch (it is possible to use try with finally without catch)
// -- try statement can be used along with the finally clause to ensure that a resource is properly closed or released, 
// regardless of whether an exception is thrown or not.