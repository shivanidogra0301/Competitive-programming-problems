package googleFAQs;

import java.util.HashSet;
import java.util.Set;

/*Given a time represented in the format "HH:MM", form the next closest time by reusing the 
 * current digits. There is no limit on how many times a digit can be reused.
You may assume the given input string is always valid. For example, "01:34", 
"12:09" are all valid. "1:34", "12:9" are all invalid.
Example 1:
Input: "19:34"
Output: "19:39"
Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which 
occurs 5 minutes later. It is not 19:33, because this occurs 23 hours and 59 minutes later.*/

public class NextTimeUsingGivenDigits {
	public static void main(String[] args) {
		String str="22:22";
		System.out.println(nextClosestTime(str));
	}
	public static String nextClosestTime(String time) {
		// Our approach is that we convert the time into minutes then continuously add 1
		//until we get the right valid time,
		int minutes=Integer.parseInt(time.substring(0,2))*60; //hh into min
		minutes+=Integer.parseInt(time.substring(3));
		Set<Integer> valdigits=new HashSet<>();
		for(char digit:time.toCharArray()) {
			valdigits.add(digit-'0');
		} // make a unique set of digits which should be used
		while(true) {
			minutes=(minutes+1)%(24*60); //increment minute by 1 and take care of case 11:59
			int[] newtime= {minutes/60/10,minutes/60%10,minutes%60/10,minutes%60%10};
			boolean isvalid=true;
			for(int digit: newtime) {
				if(!valdigits.contains(digit)) {
					isvalid=false;
				}
			}
			if(isvalid) {
				return String.format("%02d:%02d",minutes/60,minutes%60);
			}
		}
	}
}
