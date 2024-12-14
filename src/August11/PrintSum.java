package August11;

public class PrintSum {
	
	void getNumber(String input) {
		int sum=0;
		String temp="0";
		for(int index=0;index<input.length();index++) {
			
			char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					temp =temp +ch;	
					//continue;
				}else {
					sum = sum+Integer.parseInt(temp);
					temp = "0";
				}
			}
		System.out.println(sum);
		
		}
		
		
	 public static void main(String[] args) {
		 PrintSum printSum =new PrintSum();
		 String str = "techn12ocr13edit14s";
		// String str = "techn12ocr13edit14";
		 printSum.getNumber(str);
		 
	}
	
}
