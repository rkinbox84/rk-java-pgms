class CountDupCharAscii{
 public static void main(String[] args){
   String inpStr="This is java pgm";
   
   printDupCharCount(inpStr);
 
 }
 
 public static void printDupCharCount(String inpStr) {
   int[] asciiArray = new int[256];
   
   for(int i=0; i<inpStr.length();i++){
        char ch = inpStr.charAt(i);
        asciiArray[ch]++;   
   }
   
   for(int i=0; i<asciiArray.length; i++){
     if(asciiArray[i]>0 && (char)i != ' '){
	   System.out.println((char)i + ": " + asciiArray[i]);
	 }
   }
 
 }


}