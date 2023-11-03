public class AnonymousClass {
    public static void main(String args[]) {
        A obj = new A() {//Anonymous Class
            @Override public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

class A {
    public void show() {
        System.out.println("in A show");
    }
}
