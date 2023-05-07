import java.util.*;
public class Q4_count_setbit
{
    public static int countSetBit(int n){
        int ct=0;
        while(n>0){
            ct+=n&1;
            n>>=1;
        }
        return ct;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter number");
        int n=sc.nextInt();
        System.out.println("The setbits for given number is :"+countSetBit(n));
	}
}
