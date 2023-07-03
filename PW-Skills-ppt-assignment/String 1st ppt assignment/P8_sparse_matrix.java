import java.util.*;
public class P8_sparse_matrix
{
    
    public static int[][] productOfSparseMatrix(int [][]mat1,int [][]mat2){
        int m=mat1.length;
        int n=mat1[0].length;
        int colOfmat2=mat2[0].length;
        
        int [][] ans= new int [m][colOfmat2];
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (mat1[i][j]!=0){
                    for (int k=0;k<colOfmat2;k++){
                        if(mat2[j][k]!=0){
                            ans[i][k]+= mat1[i][j]*mat2[j][k];
                        }
                    }
                }
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter dimension of first matrix");
		int m=sc.nextInt();
		int k=sc.nextInt();
		System.out.println("enter numner of columns of second matrix");
		int n=sc.nextInt();
		
		System.out.println("enter elements of first matrix");
		int [][] mat1=new int [m][k];
		for (int i=0;i<m;i++){
		    for (int j=0;j<k;j++){
		        mat1[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println("enter elements of second matrix");
		int [][] mat2=new int [k][n];
		for (int i=0;i<k;i++){
		    for (int j=0;j<n;j++){
		        mat2[i][j]=sc.nextInt();
		    }
		}
		int [][]ans=productOfSparseMatrix(mat1,mat2);
		
		for (int i=0;i<ans.length;i++){
		    for (int j=0;j<ans[0].length;j++){
		        System.out.print(ans[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
	}
}
