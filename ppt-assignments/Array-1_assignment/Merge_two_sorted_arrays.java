import java.util.*;
public class Merge_two_sorted_arrays
{
    
    public static void mergeArrays(int []arr1, int []arr2,int n){
        int m=arr2.length;
        int i=n-1;
        int j=m-1;
        int k=arr1.length-1;
        
        while(i>=0&&j>=0){
            if (arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else {
                arr1[k]=arr2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }
        
        for (int elem: arr1){
            System.out.print(elem+" ");
        }
        
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of non-zero elements of first Array");
        int n=sc.nextInt();
        
        System.out.println("enter size of second Array");
        int m=sc.nextInt();
        
        
        int []arr1=new int[n+m];
        System.out.println("enter elements of first Array");
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        
        int []arr2=new int[m];
        System.out.println("enter elements of second Array");
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        
        mergeArrays(arr1,arr2,n);
	}
}
