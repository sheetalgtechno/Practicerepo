/*Program - 3 : 

Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en*/

package August11;

public class ExactlytwiceOccuring {
	
	void getCharactertwice(String input) {
		for(int index=0;index<input.length();index++) {
			int count = 0;
			char ch = input.charAt(index);
			for(int inIndex=0;inIndex<input.length();inIndex++) {
				char ch1 = input.charAt(inIndex);
				if(ch==ch1) {
					count++;
				}
			}
			if(count==2 && index==input.indexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	public static void main(String[] args) {
		String input = "teecccchhhnno";
		ExactlytwiceOccuring exactlytwiceOccuring = new ExactlytwiceOccuring();
		exactlytwiceOccuring.getCharactertwice(input);
	}
}
