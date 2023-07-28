import java.util.*;
public class AsteroidCollision
{
    
    public static int[] asteroidCollision(int[] arr){
        Stack<Integer> st=new Stack<>();
        for (int elem: arr){
            if (elem < 0){
                while(!st.empty() && st.peek() > 0 && st.peek() < Math.abs(elem)){
                    st.pop();
                }
                if (!st.empty() && st.peek() > 0 && st.peek() == Math.abs(elem)){
                    st.pop();
                    continue;
                }
                if (st.empty() || st.peek() < 0){
                    st.push(elem);
                }
            }
            else {
                st.push(elem);
            }
        }
        int ans[]= new int [st.size()];
        int i=st.size()-1;
        while(!st.empty()){
            ans[i]=st.pop();
            i--;
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter siza of Array");
		int n=sc.nextInt();
		System.out.println("enter elements of the array");
		int arr[]=new int [n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int ans[]=asteroidCollision(arr);
		System.out.println("Remaining asteroids are as follows");
		
		for (int i=0;i<ans.length;i++){
		    System.out.print(ans[i]+" ");
		}
	}
}
