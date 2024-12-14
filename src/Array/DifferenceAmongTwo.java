/*1. find the difference between youngest and oldest member of the family. 


Consider age of the family member is presented as int array.

input : {10,3,35,30,65,60}
output : 62

hint : 65-3 = 62*/

package Array;

public class DifferenceAmongTwo {
	
	public static void main(String[] s) {
		int[] num = {10,3,35,30,65,60};
		int max=0;
		int min=0;
		int diff=0;
		
		for(int index=0;index<=num.length-1;index++) {
			if(num[index] > max) {
				max=num[index];
			}
			if(num[index]<max) {
				min=num[index];
				diff=max-min;
			}
			
		}
		System.out.println("Older member : " + max);
		System.out.println("younger member: " + min);
		System.out.println("Output : " + diff);
	}

}
