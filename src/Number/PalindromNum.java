/*Assignment - 81 : 28th July'2024
write a method to find if number is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 123123
output : 123123 is not a palindrom number.
*/

package Number;

public class PalindromNum {
	
	void palindromNumber(int num) {
		int orgNum=num;
		int revNum=0;
		while(num>0) {
			int digit=num%10;
			revNum = (revNum*10) + digit;
			num=num/10;
		}
		if(orgNum==revNum) {
			System.out.println("Output : " + revNum + " is a palindrom Number");
		}else
			System.out.println("Output : " + revNum + " is not a palindrom Number");
	}
	public static void main(String[] args) {
		PalindromNum palindromNum = new PalindromNum();
		int num = 12321;
		int num2 = 123123;
		System.out.println("Input : "+ num);
		palindromNum.palindromNumber(num);
		System.out.println("Input : "+ num2);
		palindromNum.palindromNumber(num2);
	}

}
