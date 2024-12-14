/*Assignment - 82 : 28th July'2024
	
write a method to find if String is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 12331
output : 12331 is not a palindrom number.*/

package Number;

public class PalindromNumString {
	
	void palindromNum(int num) {
		int orgNum = num;
		String str = String.valueOf(num);
		String revNum = "";
		
		for(int index=str.length()-1;index>=0;index--) {
			char ch = str.charAt(index);
			revNum = revNum + ch;
		}
		num = Integer.parseInt(revNum);
		
		if(orgNum==num) {
			System.out.println("Output : " + num + " is a palindrom Number");
		}else
			System.out.println("Output : " + num + " is not a palindrom Number");
	}
	
	public static void main(String[] args) {
		PalindromNumString palindromNumString = new PalindromNumString();
		int num = 12321;
		int num2 = 12331;
		System.out.println("Input : " + num);
		palindromNumString.palindromNum(num);
		System.out.println("Input : " + num2);
		palindromNumString.palindromNum(num2);
	}

}
