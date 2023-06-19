import java.util.*;

//some personel extra efforts
class Index{
    int firstIdx , secondIdx;
    Index(int firstIdx,int secondIdx){
        this.firstIdx=firstIdx;
        this.secondIdx=secondIdx;
    }
}



public class Index_of_target_sum_elements
{
    
    //function to get indexes
    public static Index targetSumIdx(int [] arr, int t){
    Index ans=new Index(-1,-1);
    int n=arr.length;
    
    if (n<=1){
        return ans;
    }
    for (int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
            if (arr[i]+arr[j]==t){
              ans.firstIdx=i;
              ans.secondIdx=j;
              return ans;
            }
        }
    }
    return ans;
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
		
		System.out.println("Please enter the target sum");
		int target=sc.nextInt();
		
		Index ans=targetSumIdx(arr,target);
		System.out.println("["+ans.firstIdx+","+ans.secondIdx+"]");
	}
}
