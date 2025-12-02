
/**
 * Program to find first non-repeating character in a string
 * Assumption: Input string contains only ASCII characters
 * Time Complexity: O(n)
 * Space Complexity: O(1) - Fixed size array of 256
 * Author: RaviKumar K
 * Without using any collection framework
 */

public class FirstNonRepeatChar {
    public static void main(String[] args){
        String inpStr = "swissage";
        findFirstNonRepeatChar(inpStr);
    }

    public static void findFirstNonRepeatChar(String inpStr){
        int[] charCount = new int[256];

        for(int i=0; i<inpStr.length(); i++){
            char ch = inpStr.charAt(i);
            charCount[ch]++;
        }

        for(int i=0; i<inpStr.length(); i++){
            char ch = inpStr.charAt(i);
            if(charCount[ch] == 1){
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
