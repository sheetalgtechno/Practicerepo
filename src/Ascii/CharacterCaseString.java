/*Assignment -24 : Print count of uppercase, lowercase, digit, space and special characters in given input string.

Friends,
Just a small thing: In the above program, along with the count of each type of letters, can you also print those letters?
Like, I'm expecting the output as follows:
uppercase -> 2 
TC

lowercase -> 11
echnoredits

digit -> 2
43

space -> 1

special char -> 1
*/
package Ascii;

public class CharacterCaseString {
	String upperString="",lowerString="",digitString="",spaceString="",specialString="";
	int upperCount=0,lowerCount=0, digitCount=0,spaceCount=0,specialCharCount=0;
	
	void printUpperLowerCase(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				upperString+=ch;
				upperCount++;
			}
			if(Character.isLowerCase(ch)) {
				lowerString+=ch;
				lowerCount++;
			}
			if(Character.isDigit(ch)) {
				digitString+=ch;
				digitCount++;
			}
			if(Character.isSpaceChar(ch)){
				spaceString+=ch;
				spaceCount++;
			}
			else {
				specialString+=ch;
				specialCharCount++;
			}
		}
		System.out.println("Uppercase ->"+ upperCount);
		System.out.println(upperString);
		System.out.println("Lowercase ->"+ lowerCount);
		System.out.println(lowerString);
		System.out.println("Digit ->"+ digitCount);
		System.out.println(digitString);
		System.out.println("Space ->"+ spaceCount);
		System.out.println(spaceString);
		System.out.println("Special Character ->"+ specialCharCount);
		System.out.println(specialString);
	}
	
	
	
	public static void main(String[] args) {
		CharacterCaseString characterCaseString = new CharacterCaseString();
		characterCaseString.printUpperLowerCase("Techno Credits");
	}

}
