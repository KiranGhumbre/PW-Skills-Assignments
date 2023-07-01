import java.util.*;


public class Q8_array_changed_or_not
{
    public static int[] changedArray(int []arr) {
        int n=arr.length;
        if (n%2!=0){
            return new int [0];
        }
        
        int [] ans=new int [n/2];
        int [] count= new int [100001];
        
        for (int i: arr){
            count[i]++;
        }
        
        int idx=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0 && i*2< count.length && count[i*2]>0){
                count[i]--;
                count[i*2]--;
                ans[idx]=i;
                idx++;
            }
        }
        
        for (int i=0;i<count.length;i++){
            if (count[i]!=0){
                return new int[0];
            }
        }
        return ans;
    }
    
     
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of the array");
		int n=sc.nextInt();
		
		int []arr=new int [n];
		System.out.println("Please eneter elements of the array");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int [] ans=changedArray(arr);
		
		for(int i: ans){
		    System.out.print(i+" ");
		}
		
	}
}
