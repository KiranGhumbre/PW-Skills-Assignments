import java.util.*;
public class Q2_power_of_two_or_not
{
    public static boolean isPowerOfTwo(int n){
        if (n<1)return false;
        if (n==1)return true;
        if(n%2==1)return false;
        return (isPowerOfTwo(n/2));
    }
	public static void main(String[] args) {
	    //I am not comfortable with bit manipulation so I will do it by recrsion.
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter number");
        int n=sc.nextInt();
        isPowerOfTwo(n);
        System.out.println("Is given number power of two ? answer:"+isPowerOfTwo(n));
	}
}
