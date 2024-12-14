/*Assignment - 93 : 2nd Aug'2024

Remove all duplicate given name from given Array, if that name is not present, print the appropiate message.

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh"}, "Umesh"
output : ["Priya", "Umesh", "Krutika","Prabhakar", "Disha", "Saurabh"]

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh"}, "Akshay"
output : Akshay is not present at all.*/

package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
	
	void printUniqueString(String[] arr, String str) {
		List<String> list = Arrays.asList(arr);
		ArrayList<String> arrayList = new ArrayList<String>(list);
		
		if(list.contains(str)) {
			
			while(arrayList.indexOf(str)!=arrayList.lastIndexOf(str)){
				int index = arrayList.lastIndexOf(str);
				arrayList.remove(index);
			}
			System.out.println("Output : " + arrayList);
		}else {
			System.out.println("Output : " + str + "is not present at all");
			}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh"};
		String str1 = "Umesh";
		String str2 = "Akshay";
		RemoveDuplicate removeDuplicate = new RemoveDuplicate();
		System.out.println("Input : " + Arrays.toString(arr));
		removeDuplicate.printUniqueString(arr, str1);
		removeDuplicate.printUniqueString(arr, str2);
		}
}	