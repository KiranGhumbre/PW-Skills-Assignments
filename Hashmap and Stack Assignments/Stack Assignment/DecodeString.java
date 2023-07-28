import java.util.*;
public class DecodeString
{
    
    public static String decodedString(String str){    
       Stack <Character> st= new Stack<>();
       for (char ch:str.toCharArray()){
          
           if(ch!=']'){
              st.push(ch);
          }
//in=3[a2[c]]          
//st=accaccacc
//sb=cca
//k=3

          
          else {
              StringBuilder helperSb= new StringBuilder();
              while(st.peek()!='['){
                  helperSb.append(st.pop());
              }
          
       
              st.pop();
       
              int k=0;
              int base=1;
              while(!st.empty() && Character.isDigit(st.peek())){
                  k=(st.pop()-'0')*base+k;//2-0*1+0=2
                  base*=10;
                }
       
       
              while (k--> 0){
              for (int i=helperSb.length()-1;i>=0;i--){
                st.push(helperSb.charAt(i));
              }
            }
          }
       
       }
       
       char ans[]= new char[st.size()];
       for (int i=st.size()-1;i>=0;i--){
           ans[i]=st.pop();
       }
       
       return new String(ans);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter input encoded String");
		String str=sc.nextLine();
		System.out.println("The decoded String is as follows");
		System.out.println(decodedString(str));
	}
}
