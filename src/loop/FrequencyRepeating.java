/*Assignment - 88 : 31st July'2024
Find the frequency of number which is repeating in sequence.
input : {10,20,30,30,40,40,40,40,50}

output : 30 -> 2
         40 -> 4

input : {10,20,30,30,30,30,30,30,30}
output : 30 -> 6
*/

package loop;

import java.util.Arrays;

public class FrequencyRepeating {
		
		int getRepeatingSeq(int [] arr, int num,int StartNum) {
			int count = 0;
			for(int index=StartNum;index<arr.length;index++) {
				if(arr[StartNum]==arr[index]) {
					count++;
				}
			}return count;
		}
		
		void printRepeatatingSeq(int [] arr) {
			for(int index=0;index<arr.length;index++) {
				int count=getRepeatingSeq( arr,arr[index],index);
				if(count>1) {
					System.out.println("Output : " + arr[index] + " -> " + count);
					index=index+count-1;
				}
			}
		}
		public static void main(String[] args) {
			FrequencyRepeating frequencyRepeating = new FrequencyRepeating();
			int [] num = {10,20,30,30,40,40,40,40,50};
			int[] num1 = {10,20,30,30,30,30,30,30,30};
	        System.out.println("Input : " + Arrays.toString(num));   
	        frequencyRepeating.printRepeatatingSeq(num);
	        System.out.println("Input : " + Arrays.toString(num1));   
	        frequencyRepeating.printRepeatatingSeq(num1);
		}
	}

