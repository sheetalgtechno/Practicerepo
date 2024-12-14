/*Assignment - 55 : 5th July'2024 [IMP]
Print repeatative characters from given String in reverse order.
 
input : aakanksh
output : ka*/

package Array;

public class PrintRevRepeatative {

	public static void main(String[] args) {
		PrintRevRepeatative printRevRepeatative =new PrintRevRepeatative();
		System.out.println("Input : " + "aakanksha");
		System.out.print("Output : ");
		printRevRepeatative.getRevRepeatativeChar("aakanksha");
	}
	
	int getRevChar(String str,char ch) {
		int count=0;
		for(int index=str.length()-1;index>=0;index--) {
			if(ch==str.charAt(index))
					count++;
		}
		return count;
	}
	
	void getRevRepeatativeChar(String str) {
		for(int index=str.length()-1;index>=0;index--) {
			char ch = str.charAt(index);
			int count = getRevChar(str,ch);
			if(count>1)
				if(index==str.indexOf(ch)) {
					System.out.print(ch);
				}
			}
	}
}
