/*Assignment - 90 : 1st Aug'2024


Print the name which is uniquely present using Array.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]*/

package CollectionFramework;

import java.util.Arrays;

public class PrintUsingArray{
	
	int getUniqueName(String[] arr, String str) {
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (str.equals(arr[index])) {
                count++;
            }
        }
        return count; 
    }

    void printUniqueName(String[] arr) {
        String[] newArr = new String[arr.length];
        int j = 0;
        for (int index = 0; index < arr.length; index++) {
            String input = arr[index];
            int count = getUniqueName(arr, input);
            if (count == 1) {
                newArr[j] = input;
                j++;
            }
        }
        String[] result = Arrays.copyOf(newArr, j); 
        System.out.println("Output Array : " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        String[] arr = {"techno", "credits", "techno", "india", "pune", "pune"};

        PrintUsingArray printUsingArray = new PrintUsingArray();
        System.out.println("Input Array : " + Arrays.toString(arr));
        printUsingArray.printUniqueName(arr);
    }
}