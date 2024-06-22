class Areoplane3{
    public void takeoff(){
        System.out.println("AeeroPlane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying ");
    }
}
class Passangerplane2 extends Areoplane3{
    public void takeoff(){
        System.out.println("Passangerpalne2 is taking off");
    }
    public void fly(){
        System.out.println("Passangerpalne2  is flying");
    }
}
class Cargoplane2 extends Areoplane3{
    public void takeoff(){
        System.out.println("Cargoplane2 is taking off");
    }
    public void fly(){
        System.out.println("Cargoplane2 is flying");
    }
}
class Fighterplane extends Areoplane3{
    public void takeoff(){
        System.out.println("Fighterplane2 is taking off");
    }
    public void fly(){
        System.out.println("Fighterplane2 is flying");
    }
}
//achiving polymorphism
class Airport{
    public void poly(Areoplane3 ref){//object (run time polymorphism) parent type reference
        ref.takeoff();
        ref.fly();
        System.out.println("----------------");
    }
}
public class Polymorphism2{
    public static void main(String args[]){
       Cargoplane2 c2=new Cargoplane2();
       Fighterplane f1=new  Fighterplane();
       Passangerplane2 p1=new Passangerplane2();
       Airport a1=new Airport();
       a1.poly(c2);//achieving polymorphism 
       a1.poly(p1);
       a1.poly(f1);
       
    }
}