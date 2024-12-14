/*Assignment - 64 : 13th July'2024

return array having maximum numbers from two input array, if array length is not same, add all extra elements of bigger array at the end..

input : {10,33,24,55,109}
        {4,55,67,12,100,4,23,39}
		
output : [10, 55, 67, 55, 109, 4, 23, 39]*/

package loop;

public class ReturnMaxArray {
	
	public static void main(String[] args) {
		ReturnMaxArray returnMaxArray = new ReturnMaxArray();
		int[] arr1 = {10,33,24,55,109};
		int[] arr2= {4,55,67,12,100,4,23,39};
		int output=0;
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]>arr2[i]) {
				 output = arr1[i];
			}else {
				output = arr2[i];
			}
		}
	}
}
