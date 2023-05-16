import java.util.*;
public class Q5_number_of_ways_to_place_queens
{  
   
    static int ct=0;
    public static boolean isSafe(int [][]arr,int row,int col){
        int i;
        int j;
        for ( i=0;i<row;i++){
            if (arr[i][col]==1){
                return false;
            }
        }
        i=row-1;
        j=col-1;
        while(i>=0&&j>=0){
            if (arr[i][j]==1)return false;
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i>=0&&j<arr[0].length){
            if (arr[i][j]==1)return false;
            i--;
            j++;
        }
        return true;
        
    }
    public static void numberOfWays(int [][]arr,int row){
        if (row==arr.length){
            ct++;
            return;
        }
        for (int i=0;i<arr[0].length;i++){
            if (isSafe(arr,row,i)){
                arr[row][i]=1;
                numberOfWays(arr,row+1);
                arr[row][i]=0;
            }
        }
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter number of queens");
		int n=sc.nextInt();
		int [][]arr=new int [n][n];
		numberOfWays(arr,0);
		System.out.println("number of ways on which queens can be placed are : "+ct);
		
	}
}
