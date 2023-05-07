import java.util.*;
public class Q3_odd_or_even
{
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter number");
        int n=sc.nextInt();
       if((n&1)==1)
        System.out.println("Given number is Odd");
        else
        System.out.println("Given number is even");
	}
}

