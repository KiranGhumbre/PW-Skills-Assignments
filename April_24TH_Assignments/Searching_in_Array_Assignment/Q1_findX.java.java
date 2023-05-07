import java.util.*;
public class Q1_findX {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Please enter size of the Array");
    int n=sc.nextInt();
    int []arr=new int [n];
    System.out.println("Please enter the elements of the Array");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    
    System.out.println("Please enter the number that needs to be searched");
    int x=sc.nextInt();
    boolean flag=true;
    for (int i=0;i<n;i++){
        if (arr[i]==x){
            flag=false;
            System.out.println(i);
            break;
        }
    }
    if (flag){
        System.out.println("Element not found in Array");
    }
}
    
}