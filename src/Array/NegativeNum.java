/*Assignment - 41 : 2nd July'2024


Return the array of only negative numbers from given array.

input : {-10,33,44,-55,-2,-23,56,0,78}
output : {-10,-55,-2,-23}*/

package Array;

import java.util.Arrays;

public class NegativeNum {
	public static void main(String[] s) {
		int[] num = {-10,33,44,-55,-2,-23,56,0,78};
		System.out.println("Input Array : " + (Arrays.toString(num)));
		NegativeNum negativeNum = new NegativeNum();
		negativeNum.getNegativeNumberOutput(num);
				
	}	
		
	public int getNegativeNumberCount(int[] num) {
		int count=0;		
		for(int index=0;index<num.length;index++) {
			if(num[index]<0)
				count++;
		}
		return count;
	}
	
	int[] getNegativeNumberOutput(int[] num) {
		int count = getNegativeNumberCount(num);
		int[] outputArr = new int[count];
		int j = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]<0) {
				outputArr[j] = num[i];
				j++;			
			}
		}
		System.out.println("Output Array : " + Arrays.toString(outputArr));
		return outputArr;
	}
}
		

