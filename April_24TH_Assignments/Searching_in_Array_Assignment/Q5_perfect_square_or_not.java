import java.util.*;
public class Q5_perfect_square_or_not
{
    public static boolean isAPerfetctSquare(int n){
        int start=1, end=n/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (mid*mid==n){
                return true;
            }
            else if(mid*mid>n) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the number");
		int n=sc.nextInt();
		System.out.println(isAPerfetctSquare(n));
		
	}
}
