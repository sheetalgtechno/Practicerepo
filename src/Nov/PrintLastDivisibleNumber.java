/*Asssignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.*/

package Nov;

class PrintLastDivisibleNumber{
	int getLastDivNumber(int startIndex, int endIndex){
		int output=0;
		for(int index=endIndex; index>=startIndex;index--){
			if(index%5==0){
				output=index;
				break;
			}
		}
		return output;
	}
	public static void main (String[] args){
		PrintLastDivisibleNumber printLastDivisibleNumber = new PrintLastDivisibleNumber();
		System.out.println(printLastDivisibleNumber.getLastDivNumber(10,498)+ " is the last number which is div by 5 in the given range.");
	}
}
