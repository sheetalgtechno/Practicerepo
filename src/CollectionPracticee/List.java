package CollectionPracticee;

import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
		int[] arr= {12,34,34,-43,43,45,-11};
		List list =new List();
		list.getPositiveNumber(arr);	
		list.getAllObject();
		
	}
	
	public void getPositiveNumber(int[] arr) {
		ArrayList listOfNumber = new ArrayList();
		
		for(int index=0; index<arr.length;index++)
			if(arr[index]>0)
				listOfNumber.add(arr[index]);
		System.out.println(listOfNumber);
	}
	
	public void getAllObject() {
		ArrayList<Object> ListOfAll = new ArrayList<Object>();
		ListOfAll.add(12);
		ListOfAll.add("Sheetal");
		ListOfAll.add(12.24);
		ListOfAll.add(true);
		ListOfAll.add('s');
		System.out.println(ListOfAll);
	}
}
		
