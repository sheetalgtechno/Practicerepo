/*Assignment - 91 : 1st Aug'2024

Print the name which is uniquely present using ArrayList.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]*/

package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUsingArrayList {
	
	public static void main(String[] args) {
		String[] arr = {"techno", "credits", "techno", "india", "pune", "pune"};
		System.out.println("Input Array : " + Arrays.toString(arr));
		List<String> nameList = Arrays.asList(arr);
		
		ArrayList<String> listOfNames =new ArrayList<String>();
			
		for(int index=0;index<nameList.size();index++) {
			if(nameList.indexOf(nameList.get(index))==nameList.lastIndexOf(nameList.get(index))) {
				listOfNames.add(nameList.get(index));
			}
		}
		System.out.print("Output Array : ");
		System.out.print(listOfNames);
	}
}
	