package loop;

public class PrintFreqVowelWhile {
	
	public static void main(String[] args) {
		PrintFreqVowelWhile printFreqVowelWhile =new PrintFreqVowelWhile();
		printFreqVowelWhile.printVowelFreq("technocredits");
	}
	
	void printVowelFreq(String str) {
		while(str.length()>0) {
			char ch = str.charAt(0);
			int length=str.length();
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
				int newLength=str.length();
				int totalLength = length-newLength;
				System.out.println(ch + ":" + totalLength);
			}else {
				str= str.replace(String.valueOf(ch),"");
			}
		}
	}
}

