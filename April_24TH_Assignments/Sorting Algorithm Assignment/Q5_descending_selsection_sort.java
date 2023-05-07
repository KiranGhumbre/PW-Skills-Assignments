import java.util.*;
public class Q5_descending_selsection_sort
{
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int descendingSelectionSort(int [] arr, int n){
        int ct=0;
        for (int i=0;i<n;i++){
            int max_idx=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]>arr[max_idx]){
                    max_idx=j;
                    ct++;
                }
            }
            if (max_idx!=i){
               swap(arr,i,max_idx);
            } 
        }
        return ct;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter size of the Array");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Please enter the elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(descendingSelectionSort(arr,n)+" Iterations required");
	}
}
