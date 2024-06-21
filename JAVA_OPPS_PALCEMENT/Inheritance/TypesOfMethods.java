class Animal{
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public void sleep(){//inherited method
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal{
    @Override public void eat(){
        System.out.println("Tiger is eating");
    }
    public void walk(){
        System.out.println("Tiger is walking");
    }
}
class Lion extends Animal{
    @Override public void eat(){//method overridden
        System.out.println("Lion is eating");
    }
    public void hunt(){//specialized method
        System.out.println("Lion is hunting");
    }
}
public class TypesOfMethods{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        Lion l=new Lion();
        l.eat();
        Tiger t=new Tiger();
        t.walk();
    }
}

/*
    1. Inherited
    2. Overridden
    3. Specialized
 */