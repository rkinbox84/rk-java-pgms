class CountDupCharAscii{
 public static void main(String[] args){
   String inpStr="This is java pgm";
   
   printDupCharCount(inpStr);
 
 }
 
 public static void printDupCharCount(String inpStr) {
   int[] asciiArray = new int[256];
   
   for(char ch: inpStr.toCharArray()){
     asciiArray[ch]++;
   
   }
   
   for(int i=0; i<asciiArray.length; i++){
     if(asciiArray[i]>0){
	   System.out.println(asciiArray[i]);
	 }
   }
 
 }


}