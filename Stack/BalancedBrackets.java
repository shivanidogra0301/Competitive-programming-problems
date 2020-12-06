package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        s.close();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')'){
                if(!deletehandle(stack,'(')){
                    System.out.println(false);
                    return;
                }
            }else if(ch == '}'){
                if(!deletehandle(stack,'{')){
                    System.out.println(false);
                    return;
                }
                
            }else if(ch == ']'){
                if(!deletehandle(stack,'[')){
                    System.out.println(false);
                    return;
                }
                
            }
        }
        
        if(stack.empty()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

	}
	
	public static boolean deletehandle(Stack<Character> st, char opch){
        if(st.size() == 0){
            return false;
        }
        else if(st.peek() == opch){
            st.pop();
            return true;
        }
        else{
            return false;
        }
    

}

}
