import java.util.*;
public class Q4_subset_product_equals_to_target
{  
    public static boolean subsetProduct(int []arr,int idx,int currentProduct,int target){
        if (currentProduct==target) return true;
        if (idx==arr.length) return false;
        return subsetProduct(arr,idx+1,currentProduct*arr[idx],target)||subsetProduct(arr,idx+1,currentProduct,target);
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
		System.out.println("Please enter the target");
		int t=sc.nextInt();
		if (subsetProduct(arr,0,1,t)){
		    System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
