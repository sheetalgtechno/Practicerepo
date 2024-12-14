/*Assignment - 21 : 24th Nov'2024 [20 mins]

Find the length of the given string excluding space. 

input : prem lata gupta
output : length without space is 13 and space characters are 2. */

package Nov;
public class StringLength {
	int countWithSpace = 0, countWithoutSpace = 0;

	void getStringLenght(String str) {
		int totalLengthWithSpace = str.length();
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ' ') {
				countWithoutSpace++;
			}
		}
		int lengthWithoutSpace = totalLengthWithSpace - countWithoutSpace;
		System.out.println(
		"Length without space is " + lengthWithoutSpace + " "+ "and space character are"+" " + countWithoutSpace);
	}

	public static void main(String[] args) {
		StringLength stringLength = new StringLength();
		stringLength.getStringLenght("prem lata gupta");
	}
}
