/*Assignment - 32 : 7th Dec
print the freq of each character.

input : aakanksha

a -> 4
k ->2
n->1
s->1
h->1


hint : charAt , indexOf*/
package Nov_String;

public class FreqChar {
	
	void printFreqOfChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (i == str.indexOf(ch)) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " -> " + count);
            }
        }
    }

    public static void main(String[] args) {
        FreqChar freqChar = new FreqChar();
        freqChar.printFreqOfChar("aakanksha");
    }
}