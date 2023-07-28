import java.util.*;

public class RnsmStringFromMgzn
{
    
    
    public static boolean isPossible(String s1, String s2){
        
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            if (map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }
        
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i=0;i<s2.length();i++){
            char ch= s2.charAt(i);
            if (map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        
        for (Map.Entry<Character,Integer> i: map1.entrySet()){
            if (!map2.containsKey(i.getKey()) || i.getValue() > map2.get(i.getKey())){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter ransome String");
		String rnsm= sc.next();
		System.out.println("Enter magazine String ");
		String mgzn= sc.next();
		
		boolean ans= isPossible(rnsm,mgzn);
		
		System.out.println("is it possible to make rnsm form mgzn");
		System.out.println(ans);
	}
}
