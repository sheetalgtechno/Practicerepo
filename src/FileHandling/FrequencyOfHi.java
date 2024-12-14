package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FrequencyOfHi {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file =new File(".//src/resource/text");
		Scanner scan = new Scanner(file); 
		String line = "";
		while(scan.hasNext()) {
		 line = scan.nextLine();
			System.out.println(line);
		}
		int count=0;
		String[] arr = line.split(" ");
		for(String word:arr) {
			if(word.contains("Hi")) 
				count++;
		}
		System.out.println(count);
		scan.close();
	}

}
