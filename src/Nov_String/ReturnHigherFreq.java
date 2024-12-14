/*Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower

if(uCount > lCount)
	return "upper";
else if(lCount > uCount)
   return "lower";
else
   return "same";*/

package Nov_String;

public class ReturnHigherFreq {
	
	public static void main(String[] args) {
		ReturnHigherFreq returnHigherFreq = new ReturnHigherFreq();
		String str = "teChnOcreDits";
		System.out.println("Input : "+ str);
		String result=returnHigherFreq.printHigherFreq(str);
		System.out.println("Output : " +result);
	}
	
	String printHigherFreq(String str) {
		int upperCount=0,lowerCount=0;
		
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) 
					upperCount++;
				if(Character.isLowerCase(ch))
					lowerCount++;
			}
		}
		
			if(upperCount>lowerCount)
				return "Upper";
			else if(lowerCount>upperCount) 
				return "Lower";
			else 
				return "Same";
			
		}
	}

		
