import java.util.*;

public class maxElement
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
		for (int i=0;i<n;i++){
		    tmap.put(arr[i],1);
		}
		
		System.out.println("max element from array is : "+tmap.lastEntry().getKey());
	}
}
