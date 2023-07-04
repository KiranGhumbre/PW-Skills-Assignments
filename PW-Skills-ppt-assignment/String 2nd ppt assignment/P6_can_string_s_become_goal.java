import java.util.*;
public class P6_can_string_s_become_goal
{
    
   
    
    
    
    public static boolean canSbecomeGoal(String s, String goal){
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String");
		String s=sc.next();
		System.out.println("enter the string goal");
		String goal=sc.next();
		
		System.out.println(canSbecomeGoal(s,goal));
		
	}
}
