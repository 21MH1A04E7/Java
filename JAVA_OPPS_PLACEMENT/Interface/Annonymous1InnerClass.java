interface Car{
    void drive();
}
// class Scorpio implements Car{
//     public void drive(){
//         System.out.println("driving the scorpio");
//     }
// }
public class Annonymous1InnerClass{
    public static void main(String args[]){
        // Car c = new Scorpio();
        // c.drive();

        //Annonymous class
        Car obj=new Car(){//class
            public void drive(){
                System.out.println("driving the scorpio");
            }
        };
        obj.drive();
    }
}