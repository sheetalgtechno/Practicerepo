/*Assignment - 52 : 5th July'2024 [IMP]
Print all characters uniquely from given string.
 
 input : aakanksha
 output : aknsh*/

package Array;

import java.util.Arrays;

public class PrintUniqueChar {
	
	public static void main(String[] args) {
		PrintUniqueChar printUniqueChar = new PrintUniqueChar();
		System.out.println("Input : " + "aakanksha");
		System.out.print("Output : ");
		printUniqueChar.getUniqueChar("aakanksha");
	}
	
	void getUniqueChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(index==str.indexOf(ch))
				System.out.print(ch);
		}
	}
}
