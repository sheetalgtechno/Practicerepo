/*Assignment - 44 : 3rd july'2024 [IMP]


input : {"techno", "credits", "pune"}
output : {"onhcet", "stiderc", "enup"}*/

package Array;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] s) {
		String[] str = {"techno", "credits", "pune"};
		System.out.println("Input : " + Arrays.toString(str));
		ReverseString reverseString = new ReverseString();
		reverseString.getReverseString(str);
	
		
		}
	
	public String revString(String str) {
		String OutPutRev = "";
		for(int index=str.length()-1;index>=0;index--) {
			OutPutRev = OutPutRev + str.charAt(index);
		}
		return OutPutRev;
	}
	
	public String[] getReverseString(String[] str) {
		String[] arr = new String[str.length];
		for(int index=0;index<str.length;index++) {
			arr[index] = revString(str[index]); 
		}
		System.out.println("Output : " + Arrays.toString(arr));
		return arr;
	}
}

