import java.util.*;
public class Q2_all_possible_permutation
{
   
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void possiblePermutation(int []arr,int idx){
        if (idx==arr.length-1){
            printArray(arr);
            System.out.println();
        }
        for (int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            possiblePermutation(arr,idx+1);
            swap(arr,i,idx);
        }
        
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
		possiblePermutation(arr,0);
	}
}
