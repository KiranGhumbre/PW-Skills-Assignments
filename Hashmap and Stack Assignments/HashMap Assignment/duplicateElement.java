import java.util.*;

public class duplicateElement
{
    
    
   
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entr size of array");
		int n= sc.nextInt();
		System.out.println("Enter elements of array");
		int [] arr=new int[n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		
		TreeMap <Integer,Integer> tmap= new TreeMap<>();
		
	    boolean flag= false;
		for (int i=0;i<n;i++){
		    if (tmap.containsKey(arr[i])){
		        flag= true;
		        System.out.println("Yes");
		        break;
		    }
		    else{
		        tmap.put(arr[i],1);
		    }
		}
		
		if (!flag){
		    System.out.println("NO");
		}
	}
}
