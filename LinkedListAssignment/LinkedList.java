import java.util.*;
public class LinkedList
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
    public boolean isPresent(int x){
        if (head==null) return false;
        Node temp=head;
        while(temp!=null){
            if (temp.data==x)
            return true;
            temp=temp.next;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList ll= new LinkedList();
		ll.insertAtEnd(14);
		ll.insertAtEnd(21);
		ll.insertAtEnd(11);
		ll.insertAtEnd(30);
		ll.insertAtEnd(10);
		System.out.println("Please enter the number that needs to be searched");
		int x=sc.nextInt();
		if (ll.isPresent(x)){
		    System.out.println("Yes, the number entered by you is present in the list");
		}
		else System.out.println("NO, the number entered by you is Not present in the list");
		
	}
}
