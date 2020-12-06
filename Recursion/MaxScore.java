package Recursion;

import java.util.Scanner;

/*
 A number N representing number of words
N space separated strings
A number M representing number of alphabets(might be repeating)
M space separated characters
26 numbers representing score of unique alphabets from a to z.
Input
4
dog cat dad good
9
a b c d d d g o o
1 0 9 5 0 0 3 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 0 0 0
Output
23

so we have to make a subset from given words like 4 words means 16 possible subsets. Out of which
we can use those words so that there frequency did not increase given in 4 line(like o have 2 
frequency so dog and good cannot form subset) and we also want the score to be maximum.
 */

public class MaxScore {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
        scn.close();

		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}
	
public static int solution(String[] words, int[] farr, int[] score, int idx) {
		
		if(idx == words.length){
		    return 0;
		}
		
		int sno = solution(words, farr, score, idx+1);
		int scurrword = 0;
		String word = words[idx];
		boolean flag = true;
		for(int i = 0; i < word.length(); i++){
		    char ch = word.charAt(i);
		    
		    if(farr[ch - 'a'] == 0){
		        flag = false;
		    }
		    farr[ch - 'a'] --;
		    scurrword += score[ch - 'a']; 
		}
		int syes = 0;
		if(flag){
		    syes = scurrword + solution(words,farr,score,idx+1);
		}
		
		for(int i = 0; i < word.length(); i++){
		    char ch = word.charAt(i);
		    farr[ch - 'a']++;
		}
		return Math.max(sno,syes);
	}

}
