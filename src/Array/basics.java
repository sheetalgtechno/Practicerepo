

package Array;

import java.util.Arrays;

public class basics {
	
	public static void main(String[] args) {
		 int[] num = {1,5,3,6,2,4};
		 String[] arr = {"abc","pqr","xyz","abc"};
		 basics b=new basics();
	//	 b.getData(num);
		 b.getData1(arr);
	//	 b.getData2(num);
		}
		 
	 public  int[] getData(int[] num) {
		  for(int i=0;i<num.length;i++) {
			  System.out.print(i);
		  }
		  return num;
	  }
	  
	  public String[] getData1(String[] arr) {
		  for(int index=0;index<arr.length;index++) {
			 int[] output = new int [arr.length];
			 System.out.println(arr[index]);
		}
		  System.out.println(Arrays.toString(arr));
		  return arr;
	  }
	  
	  public int[] getData2(int[] num) {
		  int[] count=new int[num.length];
		  for(int i=0;i<num.length;i++) {
			 if(num[i]%2==0) {
				count[i] = num[i];
			}
		  }
		  System.out.print(Arrays.toString(count));
		  return num;
	  }
	  
	  public int getData4(int[] num) {
		  int count=0;
		  for(int i=0;i<num.length;i++) {
			  if(num[i]%2==0)
				  count++;
		  }
		  return count;
	  }
	  
	 /*public int[] getData5(int[] num) {
		  int output = getData4(num);
	  }*/
}
	  

