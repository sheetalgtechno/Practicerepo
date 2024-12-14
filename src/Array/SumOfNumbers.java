/*Assignment - 72 : 21st July'2024
Find the sum of all the numbers present in the string.
input = "I have 12 years and 3 months of experience";
output : 15*/

package Array;

public class SumOfNumbers {
	
	static int getSumOfNums(String str) {
		String[] strArr = str.split(" ");
		int sum = 0;
		int count = 0;
		for(int i = 0; i<strArr.length;i++) {
			try {
				int value = Integer.valueOf(strArr[i]);
				count++;
				sum += value;		
				}catch(NumberFormatException ne) {
			}
		}
		System.out.println("Output : " +sum);
		return sum;
	}
	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		String input = "I have 12 years and 3 months of experience";
		
		System.out.println("Sum of all number present in String is : ");
		System.out.println("Input : "+ input);
		sumOfNumbers.getSumOfNums(input);
		
	}
}

