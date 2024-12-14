package Inheritance;

public class DigitSum {
	
	int getSumOfPresentDigits(String input){
		char ch;
		int sumOfDigits = 0;
		System.out.print("Input : " + input + "\nOutput : ");
		for(int index=0;index<input.length();index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sumOfDigits = sumOfDigits + Character.getNumericValue(ch); 
			}
		}
		return sumOfDigits;
	}
	
	public static void main(String[] args) {
		int sumOfDigits = new DigitSum().getSumOfPresentDigits("t1ech2no");
		System.out.println(sumOfDigits);
		sumOfDigits = new DigitSum().getSumOfPresentDigits("credits");
		System.out.println(sumOfDigits);
		sumOfDigits = new DigitSum().getSumOfPresentDigits("1234");
		System.out.print(sumOfDigits);
	}
}