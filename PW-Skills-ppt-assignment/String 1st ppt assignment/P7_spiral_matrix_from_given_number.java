import java.util.*;
public class P7_spiral_matrix_from_given_number
{
    public static void printSpiralMatrix(int n){
        int startrow=0, endrow=n-1, startcol=0, endcol=n-1;
        int [][]ans=new int [n][n];
        
        int elem=1;
        while (startrow<=endrow && startcol<=endcol){
            for (int i=startcol;i<=endcol;i++){
                ans[startrow][i]=elem++;
            }
            startrow++;
            
            for (int i=startrow;i<=endrow;i++){
                ans[i][endcol]=elem++;
            }
            endcol--;
            
            if (startrow<=endrow){
                for (int i=endcol;i>=startcol;i--){
                    ans[endrow][i]=elem++;
                }
                endrow--;
            }
            if (startcol<=endcol){
                for (int i=endrow;i>=startrow;i--){
                    ans[i][startcol]=elem++;
                }
                startcol++;
            }
        }
         for (int i=0;i<n;i++){
             for (int j=0;j<n;j++){
                 System.out.print(ans[i][j]+" ");
             }
             System.out.println();
         }
    }
   
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please eneter the number");
        int n=sc.nextInt();
        printSpiralMatrix(n);
        
	}
}
