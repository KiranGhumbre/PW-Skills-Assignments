import java.util.*;

public class Index_of_target_val

{
    
    
   
    //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int []arr=new int [n];
		
		System.out.println("Please enter Elements the Array");
		
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("Please enter the target element");
		int val=sc.nextInt();
		
        int start=0;
        int end=arr.length-1;
        int ans=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]==val){
                ans=mid;
                break;
            }
            else if(arr[mid]>val){
                ans=mid;
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        System.out.println(ans);
		
		
	}
}
