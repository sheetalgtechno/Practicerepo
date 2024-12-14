package loop;
public class PrintUniqueChar {

	public static void main(String[] args) {
		String str = "aakanksha";
		PrintUniqueChar printUniqueChar =new PrintUniqueChar();
		printUniqueChar.PrintUniqChar(str);
	}

	void PrintUniqChar(String str) {
		while(str.length()>0) {
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			System.out.print(ch);
		}
	}
}