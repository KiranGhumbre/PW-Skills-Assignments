import java.util.*;

public class Q5_armstrong_number
{
    public static int digitSum(int n,int l){
        if (n<10){
        return (int)Math.pow(n,l);
        }
        return digitSum(n/10,l)+digitSum(n%10,l);
    }
    public static void isArmstrong(int n, int l){
        if (digitSum(n,l)==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please eneter the numbre");
		int n=sc.nextInt();
		String str="";
		str+=n;
		int k=str.length();
		isArmstrong(n,k);
	}
}
