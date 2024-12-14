/*Assignment - 45 : 3rd july'2024 [VIMP]

input : {"techno", "credits", "pune"}
output : {"enup", "stiderc", "onhcet"}
*/

package Array;

import java.util.Arrays;

public class ReverseStringRev{
	public static void main(String[] s) {
		String[] arr = {"techno", "credits", "pune"};
		//String arr1 ="techno";
		System.out.println("Input : "+ Arrays.toString(arr));
		ReverseStringRev reverseStringRev = new ReverseStringRev();
		reverseStringRev.getReverseString(arr);
		
	}
	
	public String getString(String arr) {
		String output = " ";
		for(int index=arr.length()-1;index>=0;index--) {
			output= output + arr.charAt(index);
		}
		return output;
	}
	
	public String[] getReverseString(String[] arr) {
		String[] str = new String[arr.length];
		int j=0;
		for(int index=arr.length-1;index>=0;index--) {
			str[j]=getString(arr[index]);
			j++;
		}
		System.out.println("Output :" + Arrays.toString(str));
		return str;
		
	}
}
