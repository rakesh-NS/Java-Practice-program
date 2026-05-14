public class Doublylinked {
    static class Node{
        int data;
        Node next,prev;
        Node(int d){
            data=d;
            next=prev=null;
        }
    }
    Node head;
    Node tail;
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode; 
        head=newNode;
        head.prev=null;

    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;  
        newNode.next=null;
    }
    public void insertAtposition(int data,int position){
        Node newNode=new Node(data);
        if(position==0){
            insertAtBeginning(data);
            return;
        }
        Node curr=head;
        for(int i=0;i<position-1;i++){
            if(curr==null){
                System.out.println("Position out of bounds");
                return;
            }
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next=curr.next;
        newNode.prev=curr;
        if(curr.next!=null){
            curr.next.prev=newNode;
        }
        curr.next=newNode;
    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
    }
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==0){
            deleteAtBeginning();
            return;
        }
        Node curr=head;
        for(int i=0;i<position;i++){
            if(curr==null){
                System.out.println("Position out of bounds");
                return;
            }
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Position out of bounds");
            return;
        }
        if(curr.next!=null){
            curr.next.prev=curr.prev;
        }
        if(curr.prev!=null){
            curr.prev.next=curr.next;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Doublylinked list=new Doublylinked();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.display();
        list.insertAtBeginning(0);
        list.display();
        list.insertAtposition(4,2);
        list.display();
        list.deleteAtBeginning();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtPosition(1);
        list.display();
    }
}
