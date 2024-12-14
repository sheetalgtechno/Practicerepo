/*Assignment - 94 : 2nd Aug'2024

Union of 2 arrays having all the numbers present uniquely.

int[] arr1 = {10,13,15,10,15,17,19,17};
int[] arr2 = {55,23,55,10,15,19};

output : [10, 13, 15, 17, 19, 55, 23]*/

package Map;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniquelyUnion {
	public static void main(String[] args) {
		
		int [] arr1 = {10,13,15,10,15,17,19,17};
		int [] arr2 = {55,23,55,10,15,19};
		
		System.out.println("Input : " + Arrays.toString(arr1));
		System.out.println("Input : " + Arrays.toString(arr2));
		
		Set<Integer> setOfNumbers1 = new LinkedHashSet<Integer>();
		Set<Integer> setOfNumbers2 = new LinkedHashSet<Integer>();
		
		for(int num : arr1) {
			setOfNumbers1.add(num);
		}
		
		for(int num : arr2) {
			setOfNumbers2.add(num);
		}
		
		setOfNumbers1.addAll(setOfNumbers2);
		System.out.println("Output : " + setOfNumbers1);
	}

}
