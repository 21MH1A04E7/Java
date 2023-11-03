public class Thread1 {
    public static void main(String args[]){
       A obj1=new A();
       B obj2=new B();
    //    obj1.show();
    //    obj2.show();//executed by  a sequence
        obj1.start();//both are runing in parallel
        obj2.start();

    }
}
//in every thread you should be have a run method
class A extends Thread{
    public void run(){
        for(int i=0;i<109;i++){
            System.out.println("Hi");
        }
    }
}
//in every thread you should be have a run method
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
// - We can also divide our tasks into small units.
// - In the same task or a program, we can have multiple threads running at the same time.
// - Thread is light-weight and it is the smallest unit of a task. 


// #1
// When you build an application, we use certain frameworks and behind the scene, these frameworks will create threads.
// - Every statement runs in a sequence in the main method.
// - If you want to execute two behaviours to execute at the same time, then we can use threads.
// - We can not execute normal objects in multiple threads or normal objects can not be executed simultaneously.

// #2
// - Java provides a Thread class to achieve thread programming. The thread class provides constructors and methods to create and perform operations on a thread.
// - A thread can be created by extending the thread class. The thread class can be extended through the Thread keyword.
// - By using the Thread keyword with class, it will not create a new thread.

// #3
// - We have to use the start() method in the main to start the execution of a new thread.
//  - start() is a method that is present inside the thread class. start() method only calls the run method.
// - Start() invokes the run() method on the Thread object.
// - run method should be present inside every thread to start a new thread.
// - run() method is used to do an action for a thread.

// #4
// - All threads cannot run at the same time, so threads go for the time sharing.
// -In this time-sharing Operating system, many processes are allocated with computer resources in respective time slots. 