import java.util.*;
public class Q3_descending_insertion_sort
{
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void descendingInsertionSort(int [] arr, int n){
        for (int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
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
        descendingInsertionSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
	}
}
