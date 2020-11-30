package Stack;

import java.util.Scanner;
import java.util.Stack;

/* 
 * e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true
 */
public class DuplicateBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        Stack<Character> stack = new Stack<Character>();
	        
	        for(int i = 0; i < str.length(); i++){
	            char ch = str.charAt(i);
	            if(ch != ')'){
	                stack.push(ch);
	            }
	            else{
	                if(stack.peek() == '('){
	                    System.out.println(true);
	                    return;
	                }
	                else{
	                    while(stack.peek()!= '('){
	                        stack.pop();
	                    }
	                    stack.pop();
	                }
	            }
	        }
	        
	        System.out.println(false);

	}

}
