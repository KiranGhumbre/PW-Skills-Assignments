import java.util.*;
public class Q2_alternate_sum
{
    public static int alternateSignSum(int n){
        if (n==0){
           return 0; 
        } 
        if (n%2==0){
        return alternateSignSum(n-1)-n;
        }
        else {
        return alternateSignSum(n-1)+n;
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the digit");
		int n=sc.nextInt();
		int ans=alternateSignSum(n);
		System.out.println("The alternate sign sum of given number is : "+ans);
	}
}
