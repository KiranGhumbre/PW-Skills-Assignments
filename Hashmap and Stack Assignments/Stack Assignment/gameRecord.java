import java.util.*;
import java.lang.*;
public class gameRecord
{
    public static int scoreSum(String[] op){
        int n=op.length;
        int sum=0;
        Stack <Integer> st=new Stack<>();
        for (int i=0;i<n;i++){
            if (op[i]=="+"){
                int temp=st.pop();
                int temp1=st.pop();
                int tempSum=temp+temp1;
                sum+=tempSum;
                st.push(temp1);
                st.push(temp);
                st.push(tempSum);
            }
            else if(op[i]=="D"){
                int temp=st.pop();
                int d=2*temp;
                sum+=d;
                st.push(temp);
                st.push(d);
                
            }
            else if(op[i]=="C"){
                int temp=st.pop();
                sum-=temp;
            }
            else {
                int temp= Integer.parseInt(op[i]);
                sum+=temp;
                st.push(temp);
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
		String []arr={
		    "5","2","C","D","+"
		};
		
		System.out.println("The Score Sum is as follows");
		System.out.println(scoreSum(arr));
	}
}
