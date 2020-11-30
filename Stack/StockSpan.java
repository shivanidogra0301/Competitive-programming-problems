package Stack;
import java.io.*;
import java.util.*;

/*
 * Stock span is defined as the number of days passed between the current day and the first day 
 * before today when price was higher than today.
 */
public class StockSpan {

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

	    int[] span = solve(a);
	    display(span);
	 }

	 public static int[] solve(int[] arr){
	   int[] nge = new int[arr.length];
	   Stack<Integer> st = new Stack<>();
	   st.push(arr.length-1);
	   for(int i = arr.length-2; i >=0; i--){
	       while(st.size() > 0 && arr[i] >= arr[st.peek()]){
	           int idx = st.pop();
	           nge[idx] = idx - i;
	       }
	       st.push(i);
	   }
	   while(!st.empty()){
	       int idx = st.pop();
	       nge[idx] = idx + 1;
	   }
	   return nge;
	 }

	
}
