import java.util.*;

public class Incriment_one_in_digitArray

{
    
    
   
    //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter size of the Array");
		int n=sc.nextInt();
		int []arr=new int [n];
		
		System.out.println("Please enter the Integer in the form of Array");
		
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		
		int carr=1;
		for (int i=arr.length-1;i>=0;i--){
		    int sum=arr[i]+carr;
		    if (sum<10){
		        arr[i]=sum;
		        carr=0;
		        break;
		    }
		    else{
		        arr[i]=0;
		        carr=1;
		    }
		}
		if (carr==1){
		    int res[] = new int [arr.length+1];
		    res[0]=1;
		    for (int dig : res){
		        System.out.print(dig +" ");
		    }
		    
		}
		else {
		    for (int dig : arr){
		        System.out.print(dig +" ");
		    }
		}
	}
}
