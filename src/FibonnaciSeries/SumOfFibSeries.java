/*Assignment - 84 : 30th July'2024
how many minimum numbers are required to generate sum 50 in the fibonnaci series.

input : 50
output : 9*/

package FibonnaciSeries;

public class SumOfFibSeries {
	
	void printFibonnaciSeries() {
		int num1=0,num2=1,num3=0,sum=0,count=2;
		sum=num1 + num2;
		while(sum<=50) {
			num3=num1 + num2;
			sum=sum + num3;
			num1=num2;
			num2=num3;
			count++;
		}
		System.out.println(count + " required to generate sum 50 in Fibonnaci Series");
	}
	
	public static void main(String[] args) {
		SumOfFibSeries sumOfFibSeries = new SumOfFibSeries();
		sumOfFibSeries.printFibonnaciSeries();
	}

}
