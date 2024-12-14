/* Assignment - 49 : 5th July'2024
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          e -> 2
          i -> 1*/

package Array;

public class PrintVowelFreq {
	
	public static void main(String[] s) {
		PrintVowelFreq printVowelFreq = new PrintVowelFreq();
		printVowelFreq.getVowelFreq("technocredits");
	}
	
	int getCharFreq(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i))
					count++;
		}
		return count;
	}
	
	void getVowelFreq(String str) {
		for(int j=0;j<str.length();j++) {
			char ch = str.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				int freq = getCharFreq(str,ch);
				System.out.println(ch + " : " + freq);
			}
		}
	}
}
