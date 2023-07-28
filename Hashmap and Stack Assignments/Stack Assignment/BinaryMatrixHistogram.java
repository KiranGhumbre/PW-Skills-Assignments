import java.util.*;
public class BinaryMatrixHistogram
{
    
    public static int largestRectangle(int []heights){
         int n=heights.length;
        if (n==1){
            return heights[0];
        }
        int left[]= new int [n];
        int right[]=new int [n];
        Stack<Integer> st= new Stack<>();
        int maxRectangle=0;

        left[0]= -1;
        st.push(0);
        for (int i=1;i<n;i++){
            while (!st.empty()&& heights[i]<=heights[st.peek()]){
                st.pop();
            }
            left[i]= !st.empty()?st.peek():-1;
            st.push(i);
        }

        while(!st.empty()){
            st.pop();
        }

         right[n-1]=n;
        st.push(n-1);
        for (int i=n-2;i>=0;i--){
            while (!st.empty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=!st.empty()?st.peek():n;
            st.push(i);
        }
        for (int i=0;i<n;i++){
             maxRectangle= Math.max(maxRectangle,heights[i]*(right[i]-left[i]-1));
        }
        return maxRectangle;
    }
    
    public static int largestReactangleInMatrix(int [][]arr){
        if (arr.length==0){
            return 0;
        }
        int n=arr.length;
        int m=arr[0].length;
        int res[]=new int [m];
        int ans=0;
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                res[j]= arr[i][j]==1?res[j]+1:0;
            }
            ans=Math.max(ans,largestRectangle(res));
        }
        return ans;
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number of rows");
		int n=sc.nextInt();
		System.out.println("enter number of columns");
		int m=sc.nextInt();
		System.out.println("enter binary elements of matrix");
		int mat[][]=new int [n][m];
		for (int i=0;i<n;i++){
		    for (int j=0;j<m;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		
		int ans= largestReactangleInMatrix(mat);
		System.out.println("Largets Rectangle in this matrix is : "+ans);
	}
}
