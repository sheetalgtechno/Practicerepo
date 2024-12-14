/*Assignment - 98 : 4th Aug
Find the freq of each word from given String.
String input = "Hi Hi Hello India Pune Pune Pune";
output : {Hello=1, Hi=2, India=1, Pune=3}*/

package Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Map;

public class PrintFreqOfWord {
	
	void printFreq(String input) {
		String[] wordArr = input.split(" ");
		
		Map<String,Integer> wordFreq = new TreeMap<String,Integer>();
		for(String word : wordArr) {
			if(wordFreq.containsKey(word)){
				int count = wordFreq.get(word);
				wordFreq.put(word, count+1);
			}else {
				wordFreq.put(word, 1);
			}
		}
		System.out.println("Output : " + wordFreq);
	}
	
	public static void main(String[] args) {
		PrintFreqOfWord printFreqOfWord = new PrintFreqOfWord();
		String input = "Hi Hi Hello India Pune Pune Pune";
		System.out.println("Input : " +input);
		printFreqOfWord.printFreq(input);
	}
}
