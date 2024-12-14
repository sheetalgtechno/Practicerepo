/*Assignment - 73 : 28th July'2024

Print all the prime numbers from given range, print count, sum and average of the available prime numbers in a range.

input : start range 100, end range 200
output : all prime number 
		count of prime number
		sum of all prime number
		avg of all prime number*/

package Number;

public class PrimeNumber {
	
	boolean isPrimeNum(int num) {
		boolean flag=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	void printPrimeNum(int startRange,int endRange) {
		int count=0;
		int sum=0;
		int average=0;
		for(int index=startRange;index<endRange; index++) {
			boolean flag =isPrimeNum(index);		
			if(flag) {
				System.out.print(index + " ");
				count++;
				sum +=index;
				average = sum/count;
			}
		}
		System.out.println("are Prime Numbers from given range");
		System.out.println(count + " are total number of Prime Numbers");
		System.out.println("Sum of all Prime Numbers : "+ sum);
		System.out.println("Average of Prime Numbers : " + average);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNum(7);
		primeNumber.printPrimeNum(100,200);
	}
}
