/*Assignment - 79 : 28th July'2024
write a method which accept number and return the reverse number (use String : charAt & Integer.ParseInt).

input :  15243
output : 34251*/

package Number;

public class ReverseNum {
	
	void reverseNumber(int num) {
		String str = String.valueOf(num);
		String revNum = "";
		
		for(int index=str.length()-1;index>=0;index--) {
			char ch = str.charAt(index);
			revNum = revNum + ch;
		}
		num = Integer.parseInt(revNum);
		System.out.println("Output : " + num);
	}
	
	public static void main(String[] args) {
		
		ReverseNum reverseNum = new ReverseNum();
		System.out.println("Input : " + 15243);
		reverseNum.reverseNumber(15243);
	}
}
