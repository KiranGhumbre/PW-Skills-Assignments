import java.util.*;
public class Q3_max_of_array
{
    public static int maxOfArray(int []arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int smax=maxOfArray(arr,idx+1);
        if (smax>arr[idx]){
            return smax;
        }
        else
        return arr[idx];
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Please enter element of the Array");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int ans=maxOfArray(arr,0);
		System.out.println("The max element of the Array is : "+ans);
	}
}
