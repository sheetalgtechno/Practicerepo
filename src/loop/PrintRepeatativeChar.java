/*Assignment - 61 :7th July'2024 [IMP]
Print repeatative characters from given String.
 
input : aakanksha
output : ak*/

package loop;

public class PrintRepeatativeChar {


	public static void main(String[] args) {
		String str = "aakanksha";
		PrintRepeatativeChar printRepeatativeChar  =new PrintRepeatativeChar();
		printRepeatativeChar.PrintUniqChar(str);
	}

	void PrintUniqChar(String str) {
		while(str.length()>0) {
			char ch = str.charAt(0);
			int length = str.length();
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			int totalLength = length-newLength;
			if(totalLength>1)
				System.out.print(ch);
		}
	}
}