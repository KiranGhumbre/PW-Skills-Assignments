import java.util.*;
public class Q1_convert_decimal_into_binary
{
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter decimal number");
        int n=sc.nextInt();
        int ans=0, powerOfTwo=1;
        while(n>0){
            int parity=n%2;
            ans+=parity*powerOfTwo;
            n/=2;
            powerOfTwo*=10;
        }
        System.out.println("The binary representation of the given number is :"+ans);
	}
}
