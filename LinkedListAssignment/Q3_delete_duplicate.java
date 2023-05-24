import java.util.*;
 class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        
        public Node (int d){
            data=d;
            next=null;
        }
    }
    public  void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        if (head==null){
            head=new Node(newData);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
   public void delete_duplicate(){
       if (head==null||head.next==null){
           return;
       }
       Node temp=head;
       while(temp!=null&&temp.next!=null){
           if (temp.data==temp.next.data){
               temp.next=temp.next.next;
           }else{
               temp=temp.next;
           }
       }
   }
    public void printList(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	
}
public class Q3_delete_duplicate
{
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList ll= new LinkedList();
		ll.insertAtEnd(14);
		ll.insertAtEnd(11);
		ll.insertAtEnd(11);
		ll.insertAtEnd(30);
		ll.insertAtEnd(30);
	    ll.delete_duplicate();
		System.out.println("Required output is");
		ll.printList();
	}
}

