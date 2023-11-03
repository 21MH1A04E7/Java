public class LambdaExpression {
    public static void main(String args[]){
        //creating a lambda expression and assigning it to the variable 'lambda'
        // A obj=new A(){
        //     public void show(){
        //         System.out.println("In A show");
        //     }
        // };
        
        //lambda expression
        // A obj=()->{
        //     System.out.println("IN A show");
        // };

        //lambda expression
        // A obj=()->System.out.println("IN A SHOW");
        // obj.show();
        //lambda expression with parameters
        // A obj=(int i)->System.out.println("IN A SHOW "+ i);
        
        //we can return it also
         A obj=i->System.out.println("IN A SHOW "+ i);
        obj.show(10);

        //return value by interface
        // B sum=new B(){
        //     public int add(int x,int y){
        //         return x+y;
        //     }
        // };

        // B sum=(int x,int y)->x+y;

        B sum=(x,y)->x+y;
        System.out.println(sum.add(5,6));
    }
}
@FunctionalInterface
interface A{
    void show(int i);
}
@FunctionalInterface
interface B{
    int add(int a,int b);
}