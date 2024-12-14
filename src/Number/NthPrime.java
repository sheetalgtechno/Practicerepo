/*Assignment - 74 : 28th July'2024
Find the nth prime number from given range. 

input : 100, 500, 7
output : */

package Number;

public class NthPrime {
	
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
	
	void nthPrimeNum(int startRange, int endRange, int NthPrime) {
		int count=0;
		for(int index=startRange; index<=endRange;index++) {
			boolean flag = isPrimeNum(index);
			if(flag) {
				count++;
				if(count==NthPrime) {
					System.out.println(index);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		NthPrime nthPrime =new NthPrime();
		nthPrime.nthPrimeNum(100,500,7);
	}
}
