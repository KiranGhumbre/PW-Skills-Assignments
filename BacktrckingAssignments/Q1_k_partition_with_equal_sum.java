import java.util.*;
public class Q1_k_partition_with_equal_sum
{
    public static boolean canPartition(int []arr, int k){
        int n=arr.length;
        int sum=0;
        for (int num=0;num<n;num++){
            sum+=arr[num];
        }
        if (sum%k!=0) return false;
        int target_sum=sum/k;
        boolean [] visited=new boolean [n];
        return canPartitionHelper(arr,visited,0,k,0,target_sum);
    }
    public static boolean canPartitionHelper(int []arr,boolean []visited,int idx,int k,int current_sum,int target_sum){
        if (k==1){
            return true;
        }
        if (current_sum==target_sum){
            return canPartitionHelper(arr,visited,0,k-1,0,target_sum);
        }
        for (int i=idx;i<arr.length;i++){
            if (!visited[i]){
                visited[i]=true;
                current_sum+=arr[i];
                if (canPartitionHelper(arr,visited,i+1,k,current_sum,target_sum)){
                    return true;
                }
            }
            visited[i]=false;
            current_sum-=arr[i];
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int []arr=new int [n];
		System.out.println("Please enter element of the Array");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Please enter the number of subset");
		int k=sc.nextInt();
		if(canPartition(arr,k)){
		    System.out.println("yes it is possible to partition the array.");
		}
		else {
		     System.out.println("no it is not possible to partition.");
		}
	}
}
