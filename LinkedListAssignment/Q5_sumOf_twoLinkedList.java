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
    
 // to insert at the end   
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
//to reverse a linked list   
    public Node reverse(){
        Node curr=head;
        Node nextPtr=null;
        Node prev=null;
        while(curr!=null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        head=prev;
        return head;
    }
    
// to print linked list    
    public void printList(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
// to get the sum of two linked list 
    public LinkedList digitSum(LinkedList one, LinkedList two){
    Node first=one.reverse();
    Node second=two.reverse();
    LinkedList ans= new LinkedList();
    int carry=0;
    while(first!=null||second!=null||carry!=0){
        int val1=0;
        if (first!=null){
            val1=first.data;
        }
        int val2=0;
        if (second!=null){
            val2=second.data;
        }
        int sum=carry+val1+val2;
        int digit=sum%10;
        ans.insertAtEnd(digit);
        carry=sum/10;
        if (first!=null){
            first=first.next;
        }
        if (second!=null){
            second=second.next;
        }
    }
    return ans;
     
   }
   	
}
 class Q5_sumOf_twoLinkedList
{
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList ll= new LinkedList();
		ll.insertAtEnd(2);
		ll.insertAtEnd(0);
		
		LinkedList ll2=new LinkedList();
		ll2.insertAtEnd(2);
		ll2.insertAtEnd(0);
	    LinkedList ans=new LinkedList();
	    ans=ans.digitSum(ll,ll2);
	    ans.reverse();
	    ans.printList();
	}
}

