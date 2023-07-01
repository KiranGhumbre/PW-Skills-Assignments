import java.util.*;


public class Q3_non_decreasing_square_array
{
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of array");
		
		int n=sc.nextInt();
		int []arr=new int [n];
		System.out.println("Please eneter elements of the array");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int result[]= new int [n];
		
		int l=0;
		int r=n-1;
		
		int p=n-1;
		
		while (l<r){
		    if (Math.abs(arr[l])>Math.abs(arr[r])){
		        result[p]=Math.abs(arr[l])*Math.abs(arr[l]);
		        l++;
		    }
		    else if (Math.abs(arr[l])<Math.abs(arr[r])){
		        result[p]=Math.abs(arr[r])*Math.abs(arr[r]);
		        r--;
		    }
            p--;
		    
		}
		for (int i=0;i<n;i++){
		    System.out.print(result[i]+" ");
		}
		
	}
}
