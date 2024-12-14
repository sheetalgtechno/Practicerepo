/*Assignment - 36 : 30th Jun'2024 [8 mins]

print count of negative and positive numbers from given array.

int[] num = {10,-12,4,56,77};
output : 4 positive numbers and 1 negative number in given array.*/

package Array;

public class PrintNegativePositive {
	
	public static void main(String[] s) {
		
		int[] num = {10,-12,4,56,77};
		int pCount=0;
		int nCount=0;
		System.out.print("Output : ");
		for(int index=0;index<num.length;index++) {
			if(num[index]>0) {
				pCount++;
			}else {
				nCount++;
			}
		}
		System.out.print(pCount + " Positive number ");
		System.out.print(nCount + " and Negative number in given array");
	}
}
