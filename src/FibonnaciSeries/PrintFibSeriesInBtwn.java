/*Assignment - 86 : 30th July'2024
print the fibonnaci series from range 100 to 500.*/

package FibonnaciSeries;

public class PrintFibSeriesInBtwn {
	
	void printFibonnaci(int startRange,int endRange) {
		int num1=0,num2=1;
		int num3= num1+num2;
		
		while(num3<endRange) {
			num3=num1+num2;
			if(num3>=startRange && num3<endRange) {
				System.out.print(" " + num3);
			}
			num1=num2;
			num2=num3;
		}
	}
	
	public static void main(String[] args) {
		PrintFibSeriesInBtwn printFibSeriesInBtwn = new PrintFibSeriesInBtwn();
		printFibSeriesInBtwn.printFibonnaci(100,500);
	}

}
