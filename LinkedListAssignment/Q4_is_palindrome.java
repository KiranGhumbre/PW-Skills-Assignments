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
    public boolean isPalindrome(){
      if (head.next==null){
          return true;
      }
      ArrayList<Integer> list=new ArrayList<>();
      Node temp=head;
      while(temp!=null){
          list.add(temp.data);
          temp=temp.next;
      }
      int i=0;
      int j=list.size()-1;
      while(i<j){
          if (list.get(i)!=list.get(j)){
              return false;
          }
          i++;
          j--;
      }
      return true;
    }
    public void printList(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	
}
public class Q4_is_palindrome
{
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList ll= new LinkedList();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(1);
		ll.insertAtEnd(1);
		System.out.println(ll.isPalindrome());
	}
}

