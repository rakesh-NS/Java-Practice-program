public class singlylinkedlist
{
    static class Node{
        int data;
        Node next;
        Node(int dt){
            data=dt;
            next=null;
        }
    }
    Node h;
    public void insertEnd(int data){
        Node newnode = new Node(data);
        if(h== null){
            h=newnode;
            return;
        }
       
            Node current=h;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        
    }
    public void insertBegin(int data){
        Node newnode=new Node(data);
        if (h == null) {
            h = newnode;
            return;
        }
        newnode.next=h;
        h=newnode;
    }
    public void inserAtposition(int data,int pos){
        Node newnode= new Node(data);
        if(pos == 1){
            newnode.next=h;
            h=newnode;
            return;
        }
        Node current=h;
        for(int i=2; i<pos-1;i++){
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;
    }
    public void deleteBegin(){
        if(h==null){
            System.out.println("List is empty");
            return;
        }
        h=h.next;
    }
    public void deleteeEnd(){
        if(h==null){
            System.out.println("List is empty");
            return;
        }
        if(h.next==null){
            h=null;
            return;
        }
        Node current=h;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    public void deleteAtrposition(int pos){
        if(h==null){
            System.out.println("List is empty");
            return;
        }
        if(pos==1){
            h=h.next;
            return;
        }
        Node current=h;
        for(int i=1;i<pos-1;i++){
            if(current==null || current.next==null){
                System.out.println("Position out of bounds");
                return;
            }
            current=current.next;
        }
        // if(current.next==null){
        //     System.out.println("Position out of bounds");
        //     return;
        // }
        current.next=current.next.next;
    }

    public void display(){
        Node newnode= h;
        while(newnode != null){
            System.out.print(newnode.data +"-->");
            newnode=newnode.next;
        }
        System.out.println("null");
    }
    public void deleteAtposition(int pos){
        if(h==null){
            System.out.println("List is empty");
            return;
        }
        if(pos==1){
            h=h.next;
            return;
        }
        Node current=h;
        for(int i=1;i<pos-1;i++){
            if(current==null || current.next==null){
                System.out.println("Position out of bounds");
                return;
            }
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        current.next=current.next.next;
    }
    public void deleteEnd(){
        if(h==null){
            System.out.println("List is empty");
            return;
        }
        if(h.next==null){
            h=null;
            return;
        }
        Node current=h;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
//public class Main{
		public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
       list.insertEnd(10);
       list.display();
        list.insertBegin(20);
        list.insertBegin(30);
        list.display();
        list.insertEnd(40);
       list.insertEnd(50);
       list.display();
        list.inserAtposition(70,4);
        
        
        list.display();
    }
	}