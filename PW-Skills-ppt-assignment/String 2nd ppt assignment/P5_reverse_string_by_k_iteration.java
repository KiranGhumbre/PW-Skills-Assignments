import java.util.*;
public class P5_reverse_string_by_k_iteration
{
    
    public static void swap(char []arr,int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
    
    public static String reverseStringByK(String s,int k){
        
        char []arr=s.toCharArray();
        for (int i=0;i<s.length();i=i+2*k){
            int start=i;
            int end=Math.min(i+k-1,s.length()-1);
            
            while (start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return new String(arr);
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		String ans=reverseStringByK(s,k);
		
		System.out.println(ans);
	}
}

