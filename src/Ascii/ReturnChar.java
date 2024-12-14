/*Assignment - 27 : 2nd Dec'2024 [10 mins]

Write a method which returns character of given ascii value.

input : 65
output : A

input : 90
output : Z

input : 55
output : 8 */

package Ascii;

public class ReturnChar {
	
	char getChar(int index) {
		return (char)index;
	}
	
	public static void main(String[] args) {
		ReturnChar returnChar = new ReturnChar();
		System.out.println("Input : 65 "+ "\nOutput : " + returnChar.getChar(65)+"\n");
		System.out.println("Input : 90 "+ "\nOutput : " + returnChar.getChar(90)+"\n");
		System.out.println("Input : 55 "+ "\nOutput : " + returnChar.getChar(55)+"\n");
		
	}

}
