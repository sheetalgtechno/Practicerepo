/* Assignment - 51 : 5th July'2024 [IMP]
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          i -> 1 	
*/

package Array;

public class PrintVowelFreqChar {
	
	public static void main(String[] args) {
		PrintVowelFreqChar printVowelFreqChar = new PrintVowelFreqChar();
		printVowelFreqChar.getVowelChar("technocredits");
	}
	
	int getVowelChar(String str,char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(ch==str.charAt(index))
				count++;
		}
		return count;
	}
	
	void getVowelChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch =str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
				if(index==str.indexOf(ch)) {
					int freq = getVowelChar(str,ch);
					System.out.println(ch + " :-> " + freq);
				}
			}
		}
	}
}
