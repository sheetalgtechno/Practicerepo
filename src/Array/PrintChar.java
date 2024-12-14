/*Assignment - 43 : 3 July'2024

Program 1 : Reverse index order from given Array, write a method to accept an array and return new array by reversing index order.

input : {"Prajakta", "Bhairavi", "Chaitanya", "Vishakha", "Pooja"}
output : {"Pooja", "Vishakha", "Chaitanya", "Bhairavi", "Prajakta"}

Program 2 : Same program as program 1 but on character.

input : {'t', 'o', 'c', 'k', 'l'}
output : {'l', 'k', 'c','o','t'}

Program 3 : 

input : {10,33,11,9}
output : {9,11,33,10}*/

package Array;

import java.util.Arrays;

public class PrintChar {
	
	public static void main(String[] s) {
		char[] ch = {'s','v','g','t','e','l'};
		System.out.println("Input Array : " + Arrays.toString(ch));
		PrintChar printChar =new PrintChar();
		printChar.getPrint(ch);
		String[] str = {"ABC","PQR","MNO","XYZ","SAP"};
		System.out.println("Input Array : " + Arrays.toString(str));
		printChar.getPrint(str);
		int[] num = {10,12,23,11,19,24};
		System.out.println("Input Array : "+ Arrays.toString(num));
		printChar.getPrint(num);
	}
	
	public char[] getPrint(char[] input) {
		char[] output = new char[input.length];
		int j=0;
		for(int index=input.length-1;index>=0;index--) {
			output[j]=input[index];
			j++;
		}
		System.out.println("Output Array : " + Arrays.toString(output)); 
		return output;
	}
	
	public String[] getPrint(String[] str) {
		String[] NewStr = new String[str.length];
		int j=0;
		for(int index=str.length-1;index>=0;index--) {
			NewStr[j] = str[index];
			j++;
		}
		System.out.println("OutPut Array : " + Arrays.toString(NewStr));
		return NewStr;
	}
	
	public int[] getPrint(int[] num) {
		int[] NewNum = new int[num.length];
		int j=0;
		for(int index=num.length-1;index>=0;index--) {
			NewNum[j] = num[index];
			j++;			
		}
		System.out.println("Output Array : " +Arrays.toString(NewNum));
		return NewNum;
	}
}
