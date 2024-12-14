/*Assignment - 48 : 5th July'2024
 Print frequency of each character in a given string.
 
 input : aakanksha
 output : a -> 4
          a -> 4
		  k -> 2
          a -> 4
          n -> 1
          k -> 2
          s -> 1
          h -> 1
          a -> 4*/

package Array;

public class PrintFrequency {
	
	public static void main(String[] s) {
		PrintFrequency printFrequency = new PrintFrequency();
		printFrequency.getFreqChar("aakanksha");
	}
	
	int getFreqChar(String str, char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(ch==str.charAt(index))
					count++;
		} 
		return count;
	}
	
		void getFreqChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			int count = getFreqChar(str,ch);
			System.out.println(ch + " : " + count);
		}
	}
}





























