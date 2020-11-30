package HashMap;
import java.io.*;
import java.util.*;
public class HighestFrequencyCharacter {
	   
	public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner s = new Scanner(System.in);
	        String str = s.next();
	        HashMap<Character,Integer> map = new HashMap<>();
	        char maxchar = str.charAt(0);
	        int maxfreq = Integer.MIN_VALUE;
	        for(int i = 0; i < str.length(); i++){
	            char ch = str.charAt(i);
	            if( !map.containsKey(ch)){
	                map.put(ch,1);
	            }
	            else{
	                int freq = map.get(ch) + 1;
	                if(freq > maxfreq){
	                    maxfreq = freq;
	                    maxchar = ch;
	                }
	                map.put(ch,freq);
	            }
	        }
	        System.out.println(maxchar);
	    }

	

}
