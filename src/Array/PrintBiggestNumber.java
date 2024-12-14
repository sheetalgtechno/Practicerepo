/*. find the biggest negative number from given array. 

input : {-44,-35,-99,22,55}
output : -35*/
package Array;

public class PrintBiggestNumber {
	
	public static void main(String[] s) {
		int max=0;
		int[] arr = {-44,-35,-99,22,55};
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<max) {
				max = arr[index];
			}
		}
		System.out.println("Maximum number is " + max);
		}
	}

