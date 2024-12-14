/*Assignment - 92 : 2nd Aug'2024
Return the list of all the elements uniquely.

int[] num = {10,20,93,10,30,40,50,50,20}
output : {10, 20, 93, 30, 40, 50}*/

package CollectionFramework;

import java.util.ArrayList;

public class PrintUniqueNumbers {
	
	 ArrayList<Integer> getUniqueNumbers(int[] arr) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		for(int num:arr) {
			if(!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}
	
	public static void main(String[] args) {
		int[] num = {10,20,93,10,30,40,50,50,20};
		PrintUniqueNumbers printUniqueNumbers = new PrintUniqueNumbers();
		System.out.println(printUniqueNumbers.getUniqueNumbers(num));
	}
}
