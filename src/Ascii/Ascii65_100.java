/*Assignment - 28 : 2nd Dec'2024 [20 mins]

write a method to print all the characters having ascii value from 65 to 100.

output : 
65 -> A
66 -> B 
so on .. 

write a method to print ascii values for character A to Z.
output : 
A -> 65
B -> 66
..
..
Z -> 90*/

package Ascii;

public class Ascii65_100 {
	
	void allChar(int startch,int endch) {
		int i=startch;
		for(;i<=endch;i++) {
			char ch = (char) i;
			System.out.println( i + " -> " + ch);
		}	
	}
	
	void allAsciiChar(char startch,char endch) {
		char ch =startch;
		int i;
		for(;ch<=endch;ch++) {
			i=ch;
			System.out.println(ch + "->" + i);
		}
	}
	public static void main(String[] args) {
		Ascii65_100 ascii65_100 =new Ascii65_100();
		ascii65_100.allChar(65,100);
		ascii65_100.allAsciiChar('A', 'Z');
	}

}
