import java.util.*;
public class Duplicate_and_missing_elements
{
    public static int[] findMissingAndDuplicate(int []arr){
        int n=arr.length;
        int duplicate=-1;
        int missing=n;
        for (int elem: arr){
            int absVal=Math.abs(elem);
            if (arr[absVal-1]>0){
                arr[absVal-1]*=-1;
            }
            else {
                duplicate=absVal;
            }
        }
        
        for (int i=1;i<n;i++){
            if (arr[i-1]>0){
             missing=i;
                break;
            }
        }
        
        int []ans={duplicate, missing};
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please eneter size of the Array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Please eneter elements  of the Array");
		
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int []ans=findMissingAndDuplicate(arr);
		System.out.println("The duplicate and missing elements are as follows :");
		System.out.println("["+ans[0]+","+ans[1]+"]");
	}
}
