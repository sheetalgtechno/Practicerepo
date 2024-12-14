package loop;
public class PrintNumWhile {

	public static void main(String[] args) {
		PrintNumWhile printNumWhile =new PrintNumWhile();
		printNumWhile.printNum(1,501);
	}

	void printNum(int startRange,int endRange) {
		while(startRange<=endRange) {
			if(startRange%5==0 && startRange%7==0) {
				System.out.println(startRange);
			}
			startRange++;
		}
	}
}
