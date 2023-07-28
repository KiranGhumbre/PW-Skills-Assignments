import java.util.*;
public class WarmerDay
{
    
    public static int[] warmerArr(int[] arr){
        
        int []ans= new int[arr.length];
        ans[arr.length-1]=0;
        
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        for (int i=arr.length-2; i>=0; i--){
            
            while(!st.empty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            ans[i]= !st.empty()?st.peek()-i: 0;
            st.push(i);
        }
        
        
        return ans;
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		System.out.println("enter elements of the array");
		int arr[]=new int [n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int ans[]= warmerArr(arr);
		System.out.println("Answer is as follows");
		
		for (int i=0;i<ans.length;i++){
		    System.out.print(ans[i]+" ");
		}
	}
}
