/*Program - 9
[]
Write a program to remove duplicate characters from a string.
input: parallel
output: parle

input: aashvi
output: ashvi*/

package August11;

public class UniqueCharacter {
	
	void getSingleChar(String input) {
		String output=" ";
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(index==input.indexOf(ch)) {
			    output= output+ch;
			}
		}
		System.out.println(output);	
	}
	public static void main(String[] args) {
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		String input =  "aashvi";
		uniqueCharacter.getSingleChar(input);
	}

}
