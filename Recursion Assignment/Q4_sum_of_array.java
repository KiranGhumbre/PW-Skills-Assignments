import java.util.*;
public class Q4_sum_of_array
{
    public static int sumOfArray(int []arr,int idx){
        if (idx<=0){
            return 0;
        }
        return sumOfArray(arr,idx-1)+arr[idx-1];
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
		int ans=sumOfArray(arr,n-1);
		System.out.println("The sum the Array is : "+ans);
	}
}
