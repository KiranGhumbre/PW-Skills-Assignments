import java.util.*;
public class P4_reverse_string_by_preserving_original_order
{
    
    public static StringBuilder reverseString(String str){
        
        
        StringBuilder ans=new StringBuilder();
        String [] arr=str.split(" ");
        for (String s: arr){
            for (int i=s.length()-1;i>=0;i--){
               ans.append(s.charAt(i));
            }
            ans.append(" ");
        }
        return ans;
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		
		StringBuilder ans=reverseString(str);
		System.out.println(ans);
		
	}
}
