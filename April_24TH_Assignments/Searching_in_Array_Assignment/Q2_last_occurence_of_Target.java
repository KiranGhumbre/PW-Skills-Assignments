import java.util.*;
public class Q2_last_occurence_of_Target
{
    public static int lastOccurence(int []arr, int n,int t){
        int start=0, end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]== t){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<t) start=mid+1;
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
		System.out.println("Please enter the target whose last occurence needs to searched");
		int t=sc.nextInt();
		int idx=lastOccurence(arr,n,t);
		System.out.println("The last Occurence of the target is : "+idx);
	}
}
