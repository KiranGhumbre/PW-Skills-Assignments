import java.util.*;
public class Q1_digit_sum
{
    public static int digitSum(int n){
        if (n==0) return n;
        return (n%10)+digitSum(n/10);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the digit");
		int n=sc.nextInt();
		int ans=digitSum(n);
		System.out.println("The digit sum of given number is : "+ans);
	}
}
