import java.util.*;


public class Q2_possible_staircase
{
    public  static int possibleStairCase(int n){
        
        long s=1;
        long e=n;
        
        while(s<=e){
            long mid=s+(e-s)/2;
            if (mid*(mid+1)/2==n){
                return (int)mid;
            }
            else if (mid*(mid+1)/2<n){
                s=mid+1;
            }
            else e=mid-1;
        }
        return (int)e;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter number of coins");
		
		int n=sc.nextInt();
		
		int ans= possibleStairCase(n);
		
		System.out.println("possible complete rows are : "+ans);
		
	}
}
