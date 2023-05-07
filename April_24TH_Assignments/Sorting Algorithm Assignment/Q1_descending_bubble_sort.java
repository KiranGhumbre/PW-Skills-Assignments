import java.util.*;
public class Q1_descending_bubble_sort
{
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void descendingBubbleSort(int [] arr, int n){
        for (int i=0;i<n;i++){
            boolean swapped=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]<arr[j+1]){
                    swapped=true;
                    swap(arr,j,j+1);
                }
            }
            if(!swapped) break;
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
        descendingBubbleSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	}
}
