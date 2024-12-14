/*Assignment - 75 : 28th July'2024

Find the 5th to 8th prime number from given range. 

input : 100 (startRange), 1000 (endRange), 5 (nthStartPrimeNum), 8 (nthEndPrimeNum)
output : */

package Number;

public class NthStrtEndPrime {
	
		boolean isNumPrime(int num) {
			boolean flag=true;
			for(int index=2;index<num;index++) {
				if(num%index==0) {
					flag=false;
					break;
				}
			}
			return flag;
		}
		
		void nthPrimeNum(int startRange,int endRange,int nthStrtPrimeNum, int nthEndPrimeNum) {
			int count=0;
			for(int index= startRange;index<=endRange;index++) {
				boolean flag=isNumPrime(index);
				if(flag) {
					count++;
					if(count==nthStrtPrimeNum) {
						System.out.println(index + " Start Prime Number");
					}
					if(count==nthEndPrimeNum) {
						System.out.println(index + " End Prime Number");
					}
				}
			}
		}
		public static void main(String[] args) {
			NthStrtEndPrime nthStrtEndPrime =new NthStrtEndPrime();
			nthStrtEndPrime.nthPrimeNum(100,1000,5,8);
		}
}

