public class Circulurdoubly {
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int d){
            data=d;
            prev=next=null;
        }
    }
    Node head;
    Node tail;
    public void insertAtBeginning(int data){    
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            newNode.prev=tail;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        head.prev=tail;
        tail.next=head;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            newNode.prev=tail;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=head;
        head.prev=tail;
    }
    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        head=head.next;
        head.prev=tail;
        tail.next=head;
    }
    public void deleteFromEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        do{
            System.out.print(current.data+" ");
            current=current.next;
        }while(current!=head);
        System.out.println();
    }
    public void InsertAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            insertAtBeginning(data);
            return;
        }
        Node current=head;
        int count=1;
        while(count<position-1 && current.next!=head){
            current=current.next;
            count++;
        }
        if(current.next==head){
            insertAtEnd(data);
            return;
        }
        newNode.next=current.next;
        newNode.prev=current;
        current.next.prev=newNode;
        current.next=newNode;
    }
    public static void main(String[] args) {
        Circulurdoubly list=new Circulurdoubly();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.display(); // 5 10 20
        list.InsertAtPosition(15,3);
        list.display(); // 5 10 15 20
        list.deleteFromBeginning();
        list.display(); // 10 15 20
        list.deleteFromEnd();
        list.display(); // 10 15
    }
}
