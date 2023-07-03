import java.util.*;
public class P5_min_product_sum_from_two_equal_array
{
    
    public static int minProductSum(int [] arr1, int []arr2){
        int n=arr1.length;
        
        int i=0, j=n-1, minProduct=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<n && j>=0){
            minProduct+=arr1[i]*arr2[j];
            i++;
            j--;
        }
        return minProduct;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter length of the array");
        int n=sc.nextInt();
        
        int []arr1= new int[n];
        System.out.println("Please enetre the elements of the first array");
        
        for (int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        
        System.out.println("Please enetre the elements of the second array");
        int []arr2=new int [n];
        for (int i=0;i<n;i++){
           arr2[i]=sc.nextInt();
        }
        
       int ans= minProductSum(arr1,arr2);
        
        System.out.println(ans);
	}
}
