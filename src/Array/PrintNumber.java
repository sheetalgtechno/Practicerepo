package Array;

public class PrintNumber {
	
	void getSum(int[] num){
		
		int max=0;
		int nCount=0;
		int pCount= 0;
		for(int index=0;index<=num.length-1;index++) {
			
			if(num[index] > max) {
				pCount++;
			}

			else {
				nCount++;
				
			}
		}
		System.out.println("The Positive number are " + pCount);
		System.out.println("The Negative number are " + nCount);
	}

		public static void main(String[] s) {
			int[] num = {10,-12,4,56,77};
			PrintNumber printNumber=new PrintNumber();
			printNumber.getSum(num);		
			
			}			
	}



