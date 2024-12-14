/*Assignment - 53 : 5th July'2024 [IMP]
Print non repeatative characters from given String.
 
input : aakanksha
output : nsh*/

package Array;

public class PrintNonRepeatative {
	
	public static void main(String[] args) {
		PrintNonRepeatative printNonRepeatative =new PrintNonRepeatative();
		System.out.println("Input : " + "aakanksha");
		System.out.print("Output : ");
		printNonRepeatative.getNonRepeatativeChar("aakanksha");
	}
	
	int getChar(String str, char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(ch==str.charAt(index))
					count++;
		}
		return count;
	}
	
	void getNonRepeatativeChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			int count =getChar(str,ch);
			if(count==1)
				System.out.print(ch);
			
			}
		}
	}
