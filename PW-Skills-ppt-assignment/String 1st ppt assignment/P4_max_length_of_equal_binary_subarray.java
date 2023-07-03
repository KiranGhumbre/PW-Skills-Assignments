import java.util.*;
public class P4_max_length_of_equal_binary_subarray
{
    public static int maxEqualSubArray(int []arr){
        int n=arr.length;
        int maxlength=0;
        int ct=0;
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                ct++;
            }
            else{
                ct--;
            }
            if (ct==0){
                maxlength=i+1;
            }
            else if (map.containsKey(ct)){
                maxlength=Math.max(maxlength,i-map.get(ct));
            }
            else map.put(ct,i);
        }
        return maxlength;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter length of the array");
        int n=sc.nextInt();
        
        int []mat= new int[n];
        System.out.println("Please enetre the elements of the binary array");
        
        for (int i=0;i<n;i++){
           mat[i]=sc.nextInt();
        }
        
       int ans= maxEqualSubArray(mat);
        
        System.out.println(ans);
	}
}
