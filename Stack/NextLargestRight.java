package Stack;
import java.io.*;
import java.util.*;


/*
 * You are required to "next greater element on the right" for all elements of array
 * 
 Input
5
5
3
8
-2
7
Output
8
8
-1
7
-1
 */
public class NextLargestRight {
	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] nge = solveMethod1(a);
	    display(nge);
	 }
// In this approach we first find the smaller element in the right and pop it,
//	if stack is empty means there is no greater element so -1 otherwise the peek.

	 public static int[] solveMethod1(int[] arr){
	    int[] nge = new int[arr.length];
	    Stack<Integer> stack = new Stack<>();
	    stack.push(arr[arr.length-1]);
	    nge[arr.length-1] = -1;
	    
	    for(int i = arr.length-2; i >=0; i--){
	        while(stack.size() >0 && arr[i] >= stack.peek()){
	            stack.pop();
	        }
	        
	        if(stack.empty()){
	            nge[i] = -1;
	        }else{
	            nge[i] = stack.peek();
	        }
	        
	        stack.push(arr[i]);
	    }
	    return nge;
	 }
// In this approach we first add the index of the element first, then whenever a element is
//	 added, it first pop all the smaller element and add give them ans .if after the loop there
//	 are still indexes left,then we give them -1;
	 
	 public static int[] solveMethod2(int[] arr){
		    int[] nge = new int[arr.length];
		    Stack<Integer> stack = new Stack<>();
		    stack.push(0);
		    for(int i = 1; i < arr.length; i++){
		        while(stack.size() > 0 && arr[i] >= arr[stack.peek()]){
		            int idx = stack.pop();
		            nge[idx] = arr[i];
		        }
		        stack.push(i);
		        
		    }
		    
		    while(!stack.empty()){
		        int idx = stack.pop();
		        nge[idx] = -1;
		    }
		    return nge;
		 }

	

}
