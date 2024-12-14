/*Assignment - 39 : 30th Jun'2024 [20 mins]

write a method to return max number from given array.
write an another method to return min number from given array.

input : {11,-33,22,44,56,23}
output :  56 is max number from given array
          -33 is the mininum num from given array.	*/

package Array;

public class MaxMin {
	
	public static void main(String[] s) {
		int[] arr = {11,-33,22,44,56,23};
		int max = arr[0];
		int min = arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				max = arr[index];
			}else if(arr[index]<min) {
				min=arr[index];
			}
			
		}
		System.out.println(max + " is maximum number from given array");
		System.out.println(min + " is minimum number from given array");
	}

}
