import java.util.*;
public class P6_original_array_from_changed_array
{
    
   public static int[] originalArray(int []arr){
       
       int n=arr.length;
       if (n%2!=0){
           return new int[0];
       }
       
       int []ans=new int [n/2];
       int [] count= new int [100001];
       for (int i:arr){
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
           if (count[i]!= 0){
               return new int[0];
           }
       }
       return ans;
   }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter length of the array");
        int n=sc.nextInt();
        
        int []arr1= new int[n];
        System.out.print("Please enetre the elements of the  array");
        
        for (int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        
      int []ans=originalArray(arr1);
      
      for (int i=0;i<ans.length;i++){
           System.out.println(ans[i]+" ");
        }
	}
}
