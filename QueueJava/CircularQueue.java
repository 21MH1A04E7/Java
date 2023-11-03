package QueueJava;

public class CircularQueue {

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int size){
            this.size=size;
            arr=new int[size];
        }
        //empty
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        //full
        public static boolean isFull(){
            return (rear+1)%size==front; 
        }
        //enqueue O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return ;
            }
            //1st elemenet add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove o(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());//remove
        q.add(6);
       
        //peek
        System.out.println("front element  "+q.peek());
        //print  2 3 4 5 6
         while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
