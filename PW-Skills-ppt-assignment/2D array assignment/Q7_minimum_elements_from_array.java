import java.util.*;


public class Q7_minimum_elements_from_array
{
    
     
    
    public static int findMinimum(int [] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            
            int mid=s+(e-s)/2;
            if (mid==0 || arr[mid-1]>arr[mid]){
                return arr[mid];
            }
            
            if (arr[s]> arr[mid]){
                e=mid-1;
            }
            else if (arr[mid] > arr[e]){
                s=mid+1;
            }
            else return arr[s];
        }
        return -1;
    }
    
     
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of the array");
		int n=sc.nextInt();
		
		int []arr1=new int [n];
		System.out.println("Please eneter elements of the array");
		for (int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		
		int ans= findMinimum(arr1);
		
		System.out.println(ans);
		
	}
}
