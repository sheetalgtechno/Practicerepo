/*Assignment - 100 : 4th Aug
Find the freq of each word having atleast one digit.

String input = "H1i H1i Hello Ind3ia Pune Pune Pune";
output : H1i -> 2
         Ind3ia -> 1 */

package Map;

import java.util.LinkedHashMap;
import java.util.Map;
         
public class PrintFreqDigit {
	
	boolean isWordContainDigit(String input) {
		for(char ch : input.toCharArray()) {
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;		
	}
	
	void printFreq(String input) {
		String[] wordArr = input.split(" ");
		Map<String,Integer> wordArray = new LinkedHashMap<String,Integer>();
		for(String word : wordArr) {
			if(isWordContainDigit(word)) {
				if(wordArray.containsKey(word)) {
					int count = wordArray.get(word);
					wordArray.put(word, count+1);
				}else {
				wordArray.put(word, 1);
				}
			}
		}
		System.out.println(wordArray);
	}
	
	public static void main(String[] args) {
		String input = "H1i H1i Hello Ind3ia Pune Pune Pune";
		System.out.println("Input : " + input);
		PrintFreqDigit printFreqDigit = new PrintFreqDigit();
		printFreqDigit.printFreq(input);
	}

}
