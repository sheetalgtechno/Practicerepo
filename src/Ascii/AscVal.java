/*Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/

package Ascii;

public class AscVal {
	
	  void asciiToChar(char startch, char endch) {
		for (char ch = startch; ch <=endch; ch++) {
			int ascii = ch;
			System.out.println("Ascii value of char " + ch + " is : " + ascii);
		}
	}

	public static void main(String[] args) {
		AscVal  ascVal= new AscVal();
		ascVal.asciiToChar('A','Z');
		ascVal.asciiToChar('a','z');
		ascVal.asciiToChar('0','9');
	}
}
