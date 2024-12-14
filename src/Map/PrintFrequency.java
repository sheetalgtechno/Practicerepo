/*Assignment - 97 : 4th Aug
Find the freq of each character in given word.

input : "technocredits";
output : {c=2, d=1, e=2, h=1, i=1, n=1, o=1, r=1, s=1, t=2}*/

package Map;

import java.util.TreeMap;
import java.util.Arrays;
import java.util.Map;

public class PrintFrequency {

	void printFreq(String input) {
		
		Map<Character,Integer> charFreq = new TreeMap<Character,Integer>();
		char[] charArr = input.toCharArray();
		for(char ch : charArr) {
			if(charFreq.containsKey(ch)) {
				int count = charFreq.get(ch);
				charFreq.put(ch, count+1);
			}else {
				charFreq.put(ch, 1);
			}
		}
		System.out.println("Output : " + charFreq);
	}
	
	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("Input : " + str);
		PrintFrequency printFrequency = new PrintFrequency();
		printFrequency.printFreq(str);
	}
}
