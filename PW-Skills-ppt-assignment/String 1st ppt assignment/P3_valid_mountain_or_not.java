import java.util.*;
public class P3_valid_mountain_or_not
{
    public static boolean isMountain(int []arr){

        int n=arr.length;
        if (n<3){
            return false;
        }
        
        
        int i=0;
        while (i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        
        
        if (i==0|| i==n-1){
            return false;
        }
        
        while (i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        
        return i==n-1;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter length of the array");
        int n=sc.nextInt();
        
        int []mat= new int[n];
        System.out.println("Please enetre the elements of the array");
        
        for (int i=0;i<n;i++){
           mat[i]=sc.nextInt();
        }
        
       
        
        System.out.println(isMountain(mat));
	}
}
