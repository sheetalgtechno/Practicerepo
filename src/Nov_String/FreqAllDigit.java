/*Assignment - 34 : 7th Dec [15 mins]
print the frequency of all digit characters.

int getCharFreq(String input, char ch){
	int count = 0;
	for(int index=0;index<input.length();index++){
		char currentCh = input.charAt(index);
		if(ch == currentCh)
			count++;
	}
	return count;
}

void printFreqOfAllDigitChar(String input){
	
	for(int index=0;index<input.length();index++){
		char ch = input.charAt(index);
		int charIndex = input.indexOf(ch);
		if(Character.isDigit(ch) && (charIndex == index)){
			int count = getCharFreq(ch);
			System.out.println(ch + "->" + ch);
		}
	}	
}

input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1*/

package Nov_String;

public class FreqAllDigit {
	
	int getDigitFreq(String str,char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			char currentch=str.charAt(index);
			if(ch==currentch) {
				count++;
			}
		}
		return count;
	}
	
	void printFreqAllDigit(String str) {
		
		for(int index=0;index<str.length();index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch)&&index==str.indexOf(ch)) {
				int count = getDigitFreq(str,ch);
				System.out.println(ch + " -> " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		FreqAllDigit freqAllDigit = new FreqAllDigit();
		freqAllDigit.printFreqAllDigit("AAB2cBB2BAd2ed3dd");
	}

}
