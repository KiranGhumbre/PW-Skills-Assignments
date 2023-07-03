import java.util.*;
public class P2_target_present_or_not_in_matrix
{
    public static boolean isPresent(int[][]arr,int t){
        int m= arr.length;
        int n= arr[0].length;
        
        int start=0, end=m*n-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            int row=mid/n;
            int col=mid%n;
            if (arr[row][col]==t){
                return true;
            }
            if (arr[row][col]>t){
                end=mid-1;
            }
            else start=mid+1;
        
        }
        return false;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter dimension of the matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int [][]mat= new int [m][n];
        System.out.println("Please enetre the elements of the matrix in non-decreasing order");
        
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Please enter target value that needs to searched");
        int t=sc.nextInt();
        
        System.out.println(isPresent(mat, t));
	}
}
