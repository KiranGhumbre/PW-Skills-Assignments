import java.util.*;
public class Shift_zeros_to_end
{
    
    public static void swap(int []arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of Array");
        int n=sc.nextInt();
        
        
        
        int []arr=new int[n];
        System.out.println("enter elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
       int l=0;
       int r=0;
       while(r<n){
           if (arr[r]==0){
               r++;
           }
           else {
               swap(arr,r,l);
               l++;
               r++;
           }
       }
       for (int elem : arr){
           System.out.print(elem+" ");
       }
	}
}
