/*Assignment - 26 : 2nd Dec'2024 [10 mins]

Write a method which returns ascii value of given character. 

input : 'A'
output : 65

input : 'x'
output : 120

input : ' '
output : 32

input : '.'
output : 46*/

package Ascii;

public class ReturnAscii {
	
	int asciiValue(char ch) {
		return (int)ch;
	}
	
	public static void main(String[] args) {
		ReturnAscii returnAscii = new ReturnAscii();
		System.out.println("Input :'A' " + "\nOutput :" + returnAscii.asciiValue('A') +"\n");
		System.out.println("Input :'x' " + "\nOutput :" + returnAscii.asciiValue('x')+"\n");
		System.out.println("Input :' ' " + "\nOutput :" + returnAscii.asciiValue(' ')+"\n");
		System.out.println("Input :'-' " + "\nOutput :" + returnAscii.asciiValue('-')+"\n");
		
		
	}
}
