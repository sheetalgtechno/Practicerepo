/*Assignment - 54 : 5th July'2024 [IMP]
Print repeatative characters from given String.
 
input : aakanksha
output : ak*/

package Array;

public class PrintRepeatativeChar {
	
	public static void main(String[] args) {
		PrintRepeatativeChar printRepeatativeChar =new PrintRepeatativeChar();
		System.out.println("Input : " + "aakanksha");
		System.out.print("Output : ");
		
		printRepeatativeChar.getRepeatativeChar("aakanksha");
	}
	
	int getChar(String str, char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(ch==str.charAt(index)) {
				count++;
			}
		}
		return count;
	}
	
	void getRepeatativeChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			int count = getChar(str,ch);
			if(count>1) {
				if(index==str.indexOf(ch))
					System.out.print(ch);
			}
		}
		
	}
}
