import java.util.Map;
import java.util.HashMap;

/**
 * Program to count duplicate characters in a string using Map
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Map size grows with input size
 * Author: RaviKumar K
 * Using collection framework (Map)
 */
class CountDupCharMap{

  public static void main(String[] args){
    String inpStr = " This is Java pgm";
    findDupCharCount(inpStr); 
  
  }
  
  public static void findDupCharCount(String inpStr){
    Map<Character, Integer> charCountMap = new HashMap<>();
	
	for(int i=0; i<inpStr.length(); i++){
	  char ch = inpStr.charAt(i);
	  
	  if(charCountMap.containsKey(ch)){
	    charCountMap.put(ch, charCountMap.get(ch)+1);
	  
	  }else {
	  
		charCountMap.put(ch, 1);
	  
	  }
	
	}
	
	System.out.println(charCountMap);
  }

}