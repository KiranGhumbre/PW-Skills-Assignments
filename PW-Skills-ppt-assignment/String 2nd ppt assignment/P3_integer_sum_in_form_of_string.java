import java.util.*;
public class P3_integer_sum_in_form_of_string
{
    
    public static String integerSum(String a, String b){
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0){
            int digit1=i>=0?a.charAt(i)-'0':0;
            int digit2=j>=0?b.charAt(j)-'0':0;
            
            int sum=digit1+digit2+carry;
            
            ans.insert(0,sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return ans.toString();
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first digit String");
		String str1=sc.next();
		
		System.out.println("enter second digit String");
		String str2=sc.next();
		
	   String ans=integerSum(str1,str2);
	   System.out.println("Sum is : "+ans);
		
		
	}
}
