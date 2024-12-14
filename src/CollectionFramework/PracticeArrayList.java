
package CollectionFramework; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PracticeArrayList {
	
	public static void main(String[] args) {
		
		String[] arr = {"techno", "credits", "techno", "india", "pune", "pune"};
		
		List<String> NameList = Arrays.asList(arr);
		
		ArrayList<String> listOfNames = new ArrayList<String>(NameList);
		listOfNames.add("Nagpur");
		System.out.println(listOfNames);
		
		
	}

}

