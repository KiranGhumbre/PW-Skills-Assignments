import java.util.*;

public class sortByKeyMap
{
    
    
   
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("size of map");
		int n= sc.nextInt();
		System.out.println("Enter elements of map");
		TreeMap <Integer,String> tmap= new TreeMap<>();
		for (int i=0;i<n;i++){
		    int key=sc.nextInt();
		    String value=sc.next();
		    tmap.put(key,value);
		}
		
		System.out.println("resultant map is as follws : "+tmap);
	}
}
