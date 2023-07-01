import java.util.*;


public class Q6_duplicate_elements_from_array
{
    
     
    public static List<Integer> findDuplicateElementsFromArray(int []arr){
        
        List<Integer> result= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int elem=Math.abs(arr[i]);
            if(arr[elem-1]<0){
                result.add(elem);
            }
            else {
                arr[elem-1]= -arr[elem-1];
            }
        }
        return result;
    }
    
    
     
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of the array");
		int n=sc.nextInt();
		
		int []arr1=new int [n];
		System.out.println("Please eneter elements of the array");
		for (int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		
		List <Integer> result= findDuplicateElementsFromArray(arr1);
		
		System.out.println(result);
		
	}
}
