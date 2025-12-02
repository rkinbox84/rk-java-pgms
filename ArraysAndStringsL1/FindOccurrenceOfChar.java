/**
 * This program finds the occurrence of a specific character in a given string.
 * It uses an ASCII array to count occurrences efficiently.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author: RaviKumar K
 */
public class FindOccurrenceOfChar {
    	public static int charCount(String inpStr, char ch){

	  if(inpStr == null || inpStr == " "){
	    //Unable to process just return
	    return -1;

	  }

	  int[] asciiArray = new int[256];

	  for(char ch1: inpStr.toCharArray()){

	  	asciiArray[ch1]++;

	  }

	  	return asciiArray[ch];


	} 

	public static void main(String[] args){

	  String inpStr = " this is java programing ";

	  System.out.println(charCount(inpStr, 'i'));
	}
}
