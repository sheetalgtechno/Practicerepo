/*Program : 1
String str = "techno credits pune india";
reverse each word at the same position.

output : "onhcet stiderc enup aidni"*/

package August11;

public class ReverseString {
	
	void getReverseString(String input) {
		String[] str = input.split(" ");
		for(int index=0;index<str.length; index++) {
			String str1 = str[index];
			for(int innerIndex=str1.length()-1;innerIndex>=0;innerIndex--) {
				char ch = str1.charAt(innerIndex);
				System.out.print(ch);
			}
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String input = "techno credits pune india";
		reverseString.getReverseString(input);
		
	}

}
