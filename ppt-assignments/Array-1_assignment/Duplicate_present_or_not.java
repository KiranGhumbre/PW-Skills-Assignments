import java.util.*;
public class Duplicate_present_or_not
{
    
    
    public static boolean isPresentdup(HashMap<Integer,Integer> map){
        if (map.size()<=1)
        return false;
        
        for (Map.Entry<Integer,Integer> i: map.entrySet()){
            if (i.getValue()>1){
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of Array");
        int n=sc.nextInt();
        
        
        
        int []arr=new int[n];
        System.out.println("enter elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
      HashMap <Integer,Integer> map=new HashMap <>();
      
      for (int i=0;i<n;i++){
          if (map.containsKey(arr[i])){
              int freq=map.get(arr[i]);
              map.put(arr[i],freq+1);
          }
          else {
              map.put(arr[i],1);
          }
      }
      System.out.println(isPresentdup(map));
	}
}

