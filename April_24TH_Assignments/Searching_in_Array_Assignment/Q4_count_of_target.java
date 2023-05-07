import java.util.*;
public class Q4_count_of_target
{
    public static int firstOccurence(int []arr, int n, int t){
        int start=0, end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==t){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<t)start=mid+1;
            else if (arr[mid]>t) end=mid-1;
        }
        return ans;
    }
    public static int lastOccurence(int []arr, int n, int t){
        int start=0, end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==t){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<t)start=mid+1;
            else if (arr[mid]>t) end=mid-1;
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
		System.out.println("Please enter elements whose frequency needs to be searched");
		int t=sc.nextInt();
        int last=lastOccurence(arr, n, t);
        int first=firstOccurence(arr, n, t);
        if (last<0) System.out.println("target is not present in the array");
        else
		System.out.println("frequency of given number is :"+(last-first+1));
	}
}
