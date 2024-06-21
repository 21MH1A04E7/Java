class AeroPlane1{
    public void takeOff(){
        System.out.println("AeeroPlane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying ");
    }
}
class Cargoplane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("Cargoplane1 is taking off");
    }
    public void fly(){
        System.out.println("Cargoplane1 is flying");
    }
}
class Passangeplane1 extends AeroPlane1{
    public void takeOff(){
        System.out.println("Passangerpalne1 is taking off");
    }
    public void fly(){
        System.out.println("Passangerpalne1  is flying");
    }
}
public class Polmorphism1{
    public static void main(String args[]){
        Cargoplane1 c=new Cargoplane1();
        Passangeplane1 p=new Passangeplane1();
        AeroPlane1 ref;
        //parent class reference have capactity to hold the subclass object
        ref=c;
        ref.takeOff();
        ref.fly();
        System.out.println("-------------");
        ref=p;
        ref.takeOff();
        ref.fly();
       //achiving multiple form (this is ploymorphism)
    }
}