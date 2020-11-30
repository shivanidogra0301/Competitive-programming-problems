package Stack;
import java.io.*;
import java.util.*;
public class InfixEvaluation {
	
	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();
	    Stack<Integer> oprnds = new Stack<>();
	    Stack<Character> oprtrs = new Stack<>();
	    for(int i = 0; i < exp.length(); i++){
	        char ch = exp.charAt(i);
	        if(ch == '('){
	            oprtrs.push(ch);
	        }
	        else if(Character.isDigit(ch)){
	            oprnds.push(ch - '0');
	        }
	        else if(ch == ')'){
	            while( oprtrs.peek() != '('){
	                int v2 = oprnds.pop();
	                int v1 = oprnds.pop();
	                char oprtr = oprtrs.pop();
	                int ans = operation(v1 ,v2 , oprtr);
	                oprnds.push(ans);
	            }
	            oprtrs.pop();
	        }
	        else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
	            while(oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())){
	                 int v2 = oprnds.pop();
	                 int v1 = oprnds.pop();
	                 char oprtr = oprtrs.pop();
	                 int ans = operation(v1 ,v2 , oprtr);
	                 oprnds.push(ans);
	                
	            }
	            oprtrs.push(ch);
	        }
	    }
	    
	     while( oprtrs.size() > 0){
	                int v2 = oprnds.pop();
	                int v1 = oprnds.pop();
	                char oprtr = oprtrs.pop();
	                int ans = operation(v1 ,v2 , oprtr);
	                oprnds.push(ans);
	            }
	    System.out.println(oprnds.peek());
	 }
	 
	 public static int operation(int v1, int v2, char oprtr){
	     if( oprtr == '+')
	        return v1+v2;
	    else if (oprtr == '-')
	        return v1 - v2;
	    else if (oprtr == '*')
	        return v1 * v2;
	    else
	        return v1 / v2;
	 }
	 
	 public static int precedence(char ch){
	     if(ch == '+' || ch == '-')
	         return 1;
	    else {
	        return 2;
	    }
	}
	
}
