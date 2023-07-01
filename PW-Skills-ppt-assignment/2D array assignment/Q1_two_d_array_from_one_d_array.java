import java.util.*;


public class Q1_two_d_array_from_one_d_array
{
    public static int[][] twoDArrayFromOneDArray(int []arr,int m,int n){
        int arrSize=arr.length;
        
        if (arrSize!=m*n){
            return null;
        }
        
        int [][]result= new int [m][n];
        int p=0;
        
        
        for (int i=0;i<m;i++){
            for (int j=0; j<n;j++){
                result[i][j]=arr[p];
                p++;
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of the array");
		int arrSize=sc.nextInt();
		
		System.out.println("Please enter elements of the array");
		int []arr=new int [arrSize];
		for (int i=0;i<arrSize;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("Please enter number of rows of the resultant matrix");
		int m=sc.nextInt();
		System.out.println("Please enter number of columns of the resultant matrix");
		int  n=sc.nextInt();
		
		int [][] result= twoDArrayFromOneDArray(arr,m,n);
		
	    if (result.length<=0){
	        System.out.println("2D array is not possible");
	    }
	    else {
		for (int i=0;i<m;i++){
		    for (int j=0;j<n;j++){
		        System.out.print(result[i][j]+" ");
		    }
		    System.out.println();
		}
	    }
	}
}
