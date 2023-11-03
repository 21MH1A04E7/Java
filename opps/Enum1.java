public class Enum1 {
    public static void main(String args[]){
        //Running object is assigned in s 
        Status s=Status.Running;
        System.out.println(s);
        Status[] ss=Status.values();
        // System.out.println(ss[1]);
        for(Status i:ss){
            System.out.println(i);
        }
    }
}
//in java Status is class
enum Status{
    //these are object
    //these are constant
    Running,Failed,Pending,Success;
}