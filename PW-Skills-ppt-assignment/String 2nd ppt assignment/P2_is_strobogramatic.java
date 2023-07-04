import java.util.*;
public class P2_is_strobogramatic
{
    
    public static boolean isStrobogramatic(String str){
        Map<Character,Character> map= new HashMap<>();
        map.put('1','1');
        map.put('0','0');
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        
        int left=0;
        int right=str.length()-1;
        while (left<=right){
            char leftChar=str.charAt(left);
            char rightChar=str.charAt(right);
            if (!map.containsKey(leftChar) || map.get(leftChar)!=rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter digit String");
		String str1=sc.next();
		
	
		
		System.out.println(isStrobogramatic(str1));
	}
}
