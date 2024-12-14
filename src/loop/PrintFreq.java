package loop;

public class PrintFreq {
	
	public static void main(String[] args) {
		PrintFreq printFreq =new PrintFreq();
		printFreq.printVowelFreq("technocredits");
	}
	
	void printVowelFreq(String str) {
		String Vowels = "aeiouAEIOU";
		while(str.length()>0) {
			char ch = str.charAt(0);
			int length=str.length();
			if(Vowels.contains(String.valueOf(ch))) {
				int totalLength=length-ch;
				System.out.println(ch);
				//System.out.println(ch + ":" + totalLength);
			}
				str= str.replace(String.valueOf(ch),"");
		}
	}
}
