import java.util.*;

public class Remove_val_from_array
{
    
    public static void removeVal(int []arr, int val){
        int n=arr.length;
        int k=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        System.out.println("Number of elements which are not equal to val are : "+k);
        System.out.println("The elements are as follows");
        for (int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
   
    //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int []arr=new int [n];
		
		System.out.println("Please enter Elements the Array");
		
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("Please enter the value that needs to be removed");
		int val=sc.nextInt();
		
		removeVal(arr,val);
		
		
	}
}
