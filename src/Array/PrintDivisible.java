/*Assignment - 42 : 2nd July'2024

Return the array of only numbers which is div by 3 and 5.

input : {10,33,30,44,60,2,23,56,0,78}
output : {30,60}*/

package Array;

import java.util.Arrays;

public class PrintDivisible {
	
	public static void main(String[] s) {
		int[] num = {10,33,30,44,60,2,23,56,0,78};
		System.out.println("Input : " + Arrays.toString(num));
		PrintDivisible printDivisible = new PrintDivisible();
		printDivisible.printDivisibleNumber(num);
		
	}
	
	public int getDivisibleNumber(int[] input) {
		int Count = 0;
		for(int index = 0; index<input.length; index++) {
			if(input[index]>0) {
				if(input[index]%3==0 && input[index]%5==0)
					Count++;
			}
		}
		return Count;
		
	}
	
	public int[] printDivisibleNumber(int[] input) {
		int newNumber = getDivisibleNumber(input);
		int[] OutPut = new int [newNumber];
		int temp=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
				if(input[index]%3==0 && input[index]%5==0) {
					OutPut[temp] = input[index];
					temp++;
				}
			}
		}
		System.out.println("Output : "+ Arrays.toString(OutPut));	
		return OutPut;
		
	}

}
