/*Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2*/

package Nov_String;

public class SumOfEvenOddString {
	
	void printSumAll(String str) {
		int evenSum=0;
		int oddSum=0;
		int diffSum=0;
		for(int index=0;index<str.length();index++) {
			char ch =str.charAt(index);
			if(Character.isDigit(ch)) {
				int digit=Character.getNumericValue(ch);
				if(digit%2==0) 
					evenSum+=digit;
				else 
					oddSum+=digit;
			}
		}
		diffSum=oddSum-evenSum;
		System.out.println("Output is : " + diffSum);
	}
	
	public static void main(String[] args) {
		SumOfEvenOddString sumOfEvenOddString = new SumOfEvenOddString();
		sumOfEvenOddString.printSumAll("Input : " + "te1ch2no3cre7dits");
		sumOfEvenOddString.printSumAll("Input : " + "4563");
	}

}
