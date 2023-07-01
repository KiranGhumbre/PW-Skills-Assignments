import java.util.*;


public class Q5_distance_value_from_array
{
    
     
    public static int findNumberOfdistanceElments(int [] arr1,int []arr2,int d){
        int n=arr1.length;
        int m=arr2.length;
        int ct=0;
        
        for (int i=0;i<n;i++){
            boolean flag=false;
            for (int j=0;j<m;j++){
                if (Math.abs(arr1[i]-arr2[j])<=d){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                ct++;
            }
        }
        return ct;
        
    }
     
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of 1st array");
		int n=sc.nextInt();
		
		int []arr1=new int [n];
		System.out.println("Please eneter elements of the 1st array");
		for (int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		
		System.out.println("Please enter size of 2nd array");
		int m=sc.nextInt();
		
		int []arr2=new int [m];
		System.out.println("Please eneter elements of the 2nd array");
		for (int i=0;i<m;i++){
		    arr2[i]=sc.nextInt();
		}
		
		System.out.println("Please enter the distance value element");
		int d=sc.nextInt();
		
		int ans=findNumberOfdistanceElments(arr1,arr2,d);
	    
	    System.out.println("the distance value elements are : "+ans);
	
		
	}
}
