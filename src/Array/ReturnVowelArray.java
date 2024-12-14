/*Assignment - 46 : 3rd july'2024 

Return an array having all the vowels in a string.

input : {"techno", "credits", "puneee"}
output : {"eo", "ei", "ueee"}*/

package Array;

import java.util.Arrays;

public class ReturnVowelArray {
	public static void main(String[] s) {
		String[] arr = {"techno", "credits", "puneee"};
		System.out.println("Input : " + Arrays.toString(arr));
		ReturnVowelArray returnVowelArray = new ReturnVowelArray();
		returnVowelArray.getVowelString(arr);
	}
	
	public String getString(String input) {
		String str="";
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				str = str + ch;
			}
		}
		return str;
	}
	
	public String[] getVowelString(String[] arr) {
		String[] str = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			str[index]=getString(arr[index]);
		}
		System.out.println("Output : "+ Arrays.toString(str));
		return str;		
	}
}
