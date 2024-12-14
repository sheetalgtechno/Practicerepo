/*Assignment - 47 : 3rd july'2024 

Return an int array having all the digits from String array.

input : {"te1ch3no", "cr5edit7s7", "6pun6eee2"}
output : {13,577,662}
*/

package Array;

import java.util.Arrays;

public class ExtractDigits {
	
	public static void main(String[] s) {
		String[] arr = {"te1ch3no", "cr5edit7s7", "6pun6eee2"};
		String str = "6pun6eee2";
		System.out.println("Input: " + Arrays.toString(arr));
		ExtractDigits extractDigits = new ExtractDigits();
		extractDigits.getExtractDigits(arr);
		//extractDigits.getString(str);
	}
	
	public String getString(String input) {
		String str = " ";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				str = str + ch;
			}
		}
	//	System.out.println("Output : "+str);
		return str;
	}
	
	public String[] getExtractDigits(String[] arr) {
		String[] str = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			str[index] = getString(arr[index]);
		}
		System.out.println("Output : " + Arrays.toString(str));
		return str;
	}

}
