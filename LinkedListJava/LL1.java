package LinkedListJava;
public class LL1 {
    Node head;
    private int size;
    LL1(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add in first position
    public void addFrist(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //delete first
    public void deleteFirst(){
        if(head==null)return;
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast(){
        if(head==null)return;

        size--;

        if(head.next==null){
            head=null;
            return ;
        }
        Node secondNode=head;
        Node temp=head.next;
        while(temp.next!=null){
            secondNode=temp;
            temp=temp.next;
        }
        secondNode.next=null;
    }
    //get size
    public int getsize(){
        return size;
    }
    //print
    public void printList(){
        if(head==null){
            return ;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        LL1 list=new LL1();
        //Creating nodes for the linkedlist
        list.addFrist("a");
        list.addFrist("e");
        list.addFrist("f");
        list.addFrist("g");
        // list.printList();
        list. addLast("r");
        //delete first
        list.deleteFirst();
        //delete last
        list.deleteLast();
        //print
        list.printList();
        list.addFrist("this");
        System.out.println(list.getsize());
    }
}
