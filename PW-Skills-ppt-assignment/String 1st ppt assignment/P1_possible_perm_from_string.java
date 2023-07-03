import java.util.*;
public class P1_possible_perm_from_string
{
    public static List<Integer> possiblePerm(String str){
        
        int n=str.length();
        int low=0, high=n;
        List<Integer> ans=new ArrayList<>();
        
            
            int i=0;
            while(low<high){
                char ch=str.charAt(i);
                if (ch=='I'){
                    ans.add(low);
                    low++;
                }
                else if(ch=='D'){
                    ans.add(high);
                    high--;
                }
                i++;
            }
        
        ans.add(low);
        return ans;
    }
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.next();
        
        List <Integer> ans=possiblePerm(str);
        System.out.println(ans);
	}
}
