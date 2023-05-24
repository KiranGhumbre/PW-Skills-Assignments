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
    public void insert_at(int newElement, int pointer ){
        Node newNode= new Node(newElement);
        newNode.data=newElement;
        if (pointer==1){
            newNode.next=head;
            head=newNode;
        }
        else {
            Node temp=head;
            for (int i=1;i<pointer-1;i++){
                if (temp!=null)
                temp=temp.next;
            }
            if(temp!=null){
                newNode.next=temp.next;
                temp.next=newNode;
            }
            else{
                System.out.print("previous pointer is null");
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
public class Q2_insert_at
{
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList ll= new LinkedList();
		ll.insertAtEnd(14);
		ll.insertAtEnd(21);
		ll.insertAtEnd(11);
		ll.insertAtEnd(30);
		ll.insertAtEnd(10);
		System.out.println("Please enter the element and pointer that needs to be inserted");
		int x=sc.nextInt();
		int pointer=sc.nextInt();
		ll.insert_at(x,pointer);
		System.out.println("Required output is");
		ll.printList();
	}
}

