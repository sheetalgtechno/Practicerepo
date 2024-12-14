/*Assignment - 80 : 28th July'2024
write a method which accept number and return the reverse number (without using String).

input :  15243
output : 34251*/

package Number;

public class ReverseNumWithoutString {
		
	void reverseNum(int num) {
		int orgNum =num;
		int sum=0;
		while(num>0) {
			int digit = num % 10;
			sum = (sum*10)+digit;
			num = num/10;
		}
		System.out.println("Output : " + sum);
	}
		
	public static void main(String[] args) {
			ReverseNumWithoutString reverseNumWithoutString =new ReverseNumWithoutString(); 
			int num =15243;
			System.out.println("Input : " + num);
			reverseNumWithoutString.reverseNum(num);
		}
}
