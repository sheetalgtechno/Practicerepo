/*Assignment - 50 : 5th July'2024 [IMP]
 Print frequency of each character in a given string.
 
 input : aakanksha
 output : a -> 4
          k -> 2
          n -> 1
          s -> 1
          h -> 1*/

package Array;

public class PrintFreqChar {
	
	public static void main(String[] args) {
		PrintFreqChar printFreqChar = new PrintFreqChar();
		printFreqChar.getFreqChar("aakanksha");
	}
	
	int getFreqChar(String str,char ch) {
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
			if(index==str.indexOf(ch)) {
				int Freq = getFreqChar(str,ch);
				System.out.println(ch + " : " + Freq);
			}
		}
	}
}
