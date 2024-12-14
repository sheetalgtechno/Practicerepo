package loop;
public class PrintFreqCharWhile {

	public static void main(String[] args) {
		PrintFreqCharWhile printFreqCharWhile =new PrintFreqCharWhile();
		printFreqCharWhile.printFreqChar("aakanksha");
	}

	void printFreqChar(String str) {
		while(str.length()>0) {
			char ch = str.charAt(0);
			int length = str.length();
			str=str.replace(String.valueOf(ch), "");
			int newLength=str.length();
			int totalLength = length-newLength;
			System.out.println(ch + " :- " +totalLength);
		}
	}
}