public class Circulurlinked{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        newNode.next=head;
        curr.next=newNode;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
    }
    public void insertAtposition(int data,int position){
        Node newNode=new Node(data);
        if(position==0){
            insertAtBeginning(data);
            return;
        }
        Node curr=head;
        for(int i=0;i<position-1;i++){
            if(curr.next==head){
                System.out.println("Position out of bounds");
                return;
            }
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public  void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==0){
            deleteAtBeginning();
            return;
        }
        Node curr=head;
        for(int i=0;i<position-1;i++){
            if(curr.next==head){
                System.out.println("Position out of bounds");
                return;
            }
            curr=curr.next;
        }
        if(curr.next==head){
            System.out.println("Position out of bounds");
            return;
        }
        curr.next=curr.next.next;
    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        head=head.next;
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        Circulurlinked cl=new Circulurlinked();
        cl.insertAtEnd(1);
        cl.insertAtEnd(2);
        cl.insertAtBeginning(0);
        cl.display(); // Output: 0 1 2
        cl.deleteAtBeginning();
        cl.display(); // Output: 1 2
        cl.deleteAtEnd();
        cl.display(); // Output: 1
    }
}
