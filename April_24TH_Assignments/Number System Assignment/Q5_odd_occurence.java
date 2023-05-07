import java.util.*;
public class Q5_odd_occurence
{
    
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter size of the Array");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Please enter the elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=0;
        for (int i=0;i<n;i++){
            result=result^arr[i];
        }
        System.out.println("The Odd times occured element is :"+result);
	}
}
