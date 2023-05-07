import java.util.*;
public class Q3_count_of_1s
{
    public static int lastOccurence(int []arr, int n){
        int start=0, end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]== 0){
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Please enter elements of the Array");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int idx=lastOccurence(arr,n)+1;
		System.out.println("The number of 1's are : "+(n-idx));
	}
}
