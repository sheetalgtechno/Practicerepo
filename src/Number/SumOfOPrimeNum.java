/*Assignment - 78 : 28th July'2024

find minimum required prime numbers to generate sum 50. 

output : minimum 7 prime numbers are required to generate sum 50.   
Hint : 2 + 3 + 5 + 7 + 11 + 13 + 17 */

package Number;

public class SumOfOPrimeNum {
	
	boolean isNumPrime(int num) {
		boolean flag=true;
		for(int index=2;index<num;index++) {
			if(num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void printSum() {
		int num = 2,sum = 0,count = 0;
		while(sum<50) {
			boolean flag = isNumPrime(num);
			if(flag) {
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("Minimun "+ count + " prime numbers are required to generate sum 50");
	}
	
	public static void main(String[] args) {
		SumOfOPrimeNum sumOfOPrimeNum = new SumOfOPrimeNum();
		sumOfOPrimeNum.printSum();
	}
}
