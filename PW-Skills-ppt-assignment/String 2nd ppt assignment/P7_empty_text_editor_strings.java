import java.util.*;
public class P7_empty_text_editor_strings
{
    
   
    
    
    
    public static String backSpaceString(String s){
        
        StringBuilder ans= new StringBuilder ();
        int n=s.length();
        int hashct=0;
        
        for (int i=n-1;i>=0;i--){
            if (s.charAt(i)=='#'){
                hashct++;
                continue;
            }
            if (hashct>0){
                hashct--;
            }
            else {
                ans.insert(0,s.charAt(i));
            }
        }
        return ans.toString();
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.next();
		System.out.println("enter the second string");
		String s2=sc.next();
		
		String s1ans=backSpaceString(s1);
		String s2ans=backSpaceString(s2);
		
		System.out.println(s1ans.equals(s2ans));
		
	}
}
