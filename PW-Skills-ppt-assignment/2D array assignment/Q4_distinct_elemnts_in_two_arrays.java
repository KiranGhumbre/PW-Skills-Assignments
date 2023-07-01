import java.util.*;


public class Q4_distinct_elemnts_in_two_arrays
{
    public static List<List<Integer>> distinctElementsFromTwoarrays(int []num1, int [] num2){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        for (int elem: num1){
            set1.add(elem);
        }
        
        for (int elem: num2){
            set2.add(elem);
        }
        
        ArrayList<Integer> elementsAbsentInNum2= new ArrayList<>();
        ArrayList<Integer> elementsAbsentInNum1= new ArrayList<>();
        
        for (int elem: set1){
            if(!set2.contains(elem)){
                elementsAbsentInNum2.add(elem);
            }
        }
        
        for (int elem: set2){
            if(!set1.contains(elem)){
                elementsAbsentInNum1.add(elem);
            }
        }
        
        List<List<Integer>> result= new ArrayList<>();
        
        result.add(elementsAbsentInNum2);
        result.add(elementsAbsentInNum1);
        
        return result;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Please enter size of 1st array");
		int n=sc.nextInt();
		
		int []nums1=new int [n];
		System.out.println("Please eneter elements of the 1st array");
		for (int i=0;i<n;i++){
		    nums1[i]=sc.nextInt();
		}
		
		System.out.println("Please enter size of 2nd array");
		int m=sc.nextInt();
		
		int []nums2=new int [m];
		System.out.println("Please eneter elements of the 2nd array");
		for (int i=0;i<m;i++){
		    nums2[i]=sc.nextInt();
		}
		
		List<List<Integer>> result= distinctElementsFromTwoarrays(nums1,nums2);
		
		System.out.println(result);
	
	
		
	}
}
