import java.util.*;
public class Unique_character_in_string
{
    public static int fistNonRepeatingCharacter(String str){
        if (str.length()==1)
        return 1;
        int ans=-1;
        HashMap<Character,Integer> map= new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (map.get(ch)==1){
                ans=i;
                break;
            }
        }
        return ans;
        
    }
	public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("Please Enter String");
       String str=sc.next();
       int n=fistNonRepeatingCharacter(str);
       System.out.println(n);
	}
}
