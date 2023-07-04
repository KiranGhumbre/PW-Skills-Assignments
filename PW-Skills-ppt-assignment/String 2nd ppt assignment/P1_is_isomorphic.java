import java.util.*;
public class P1_is_isomorphic
{
    
    public static boolean isIsomorphic(String str, String t){
        if (str.length()!=t.length()){
            return false;
        }
        
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Boolean> map2=new HashMap<>();
        
        for (int i=0;i<str.length();i++){
            char ch1= str.charAt(i);
            char ch2= t.charAt(i);
            
            if (map1.containsKey(ch1)){
                if (map1.get(ch1)!= ch2)
                return false;
            }
            else {
                if (map2.containsKey(ch2)){
                    return false;
                }
                else {
                    map1.put(ch1,ch2);
                    map2.put(ch2,true);
                }
            }
        }
        return true;
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first String");
		String str1=sc.next();
		
		System.out.println("enter target String");
		String t=sc.next();
		
		System.out.println(isIsomorphic(str1,t));
	}
}
