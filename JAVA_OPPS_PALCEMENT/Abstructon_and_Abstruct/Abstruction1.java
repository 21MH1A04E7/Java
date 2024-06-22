abstract class Areoplane3{
    abstract public void fly();
    abstract public void land();
    public void takeof(){
        System.out.println("taking off");
    }
}
class Cargoplane3 extends Areoplane3{
    public void fly(){
        System.out.println("Cargoplane3 flying ");
    }
    public void land(){
        System.out.println("Cargoplane3 landing ");
    }
    public void alert(){
        System.out.println("Cargoplane3 alert ");
    }
}
class Passengerplane3 extends Areoplane3{
    public void fly(){
        System.out.println("Passengerplane3 flying ");
    }
    public void land(){
        System.out.println("Passengerplane3 landing ");
    }
}
public class Abstruction1{
    public static void main(String args[]){
        // Areoplane3 a=new Areoplane3(); //can't create the object of abstruct class
        Areoplane3 a=new Cargoplane3();
        a.fly();
        a.land();
        a.takeof();
        System.out.println("------------");
        ((Cargoplane3)a).alert();//cloud classing (we can't access the specalized method)
        a.takeof();
        // a.alert();
        System.out.println("------------");
        Areoplane3 ref2=new Passengerplane3();
        ref2.fly();
        ref2.land();
    }
}

/*
 such method which have no body(they don't have implimentation)
 //Abstract class have at least one abstract method
 //we can't define the abstract variable    

 */