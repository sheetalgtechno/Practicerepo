/*Assignment - 23 : 26th Nov'2024 [30 mins]

Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.*/

package Nov;

public class CountLetterCase {

	void printCount(String input) {
		int lCount = 0, uCount = 0, dCount = 0, spaceCount = 0, specialCharCount = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) 
					uCount++;
				else 
					lCount++;
			} else if (Character.isDigit(ch)) {
				dCount++;
			} else if (ch == ' ')
				spaceCount++;
			   else 
				specialCharCount++;
		}
		System.out.println("Upper case count is-:" + uCount);
		System.out.println("Upper case count is-:" + lCount);
		System.out.println("Upper case count is-:" + dCount);
		System.out.println("Upper case count is-:" + spaceCount);
		System.out.println("Upper case count is-:" + specialCharCount);
	}

	public static void main(String[] args) {
		CountLetterCase countLetterCase = new CountLetterCase();
		countLetterCase.printCount("Te4c_hno Credi3ts");
	}
}
