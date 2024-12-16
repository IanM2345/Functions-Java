package griffith;

public class Main {
   
	public static boolean isEven(int number) {
		return number%2 ==0;
	}
	public static boolean isAlpha(char ch) {
		return Character.isLetter(ch);
	}
	public static int alphaCount(String str) {
		int count=0;
		for (char chr: str.toCharArray()) {
			if (Character.isLetter(chr)){
				count++;
			}
			
		}
		return count;
	}
	public static int gcdCalculator(int num1 , int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
	public static String swapGender(String sentence) {
		sentence = sentence.replaceAll ("\\bhe\\b", "she");
		sentence = sentence.replaceAll ("\\bhim\\b", "her");
		sentence = sentence.replaceAll ("\\bhis\\b", "hers");
		return sentence;
	}
	public static String reverse(String word) {
		char[] charArray = word.toCharArray();
		for (int i = 0, j=charArray.length-1;i<j;i++,j--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j]= temp;
		}
		return new String(charArray);
	}
	public static void palindrome (String word) {
		String lowerCaseWord = word.toLowerCase();
		String processword = lowerCaseWord.replaceAll("//s","");
		String reversedWord = reverse(processword);
		if (lowerCaseWord.equals(reversedWord)) {
			System.out.println( word + "is palindrome" );
		}
		else {
			System.out.println( word + "is not palindrome" );
		}
	}
	
	public static void main(String[] args) {
		System.out.println("20 is even" + isEven(20));
		System.out.println("? is alphabetical"+ isAlpha('?'));
		System.out.println("The amount of alphabetical characters in 100.07"+ alphaCount("100.07"));
		System.out.println("The gcd of 48 and 18 is" + gcdCalculator(48,18) );
		System.out.println("Dibbler liked to describe himself as a merchant adventurer; everyone else liked to describe him as an itinerant pedlar whose money-making schemes were always let down by some small but vital flaw, such as trying to sell things he didnt own or which didnt work or, sometimes, didnt even exist"+
		                   "_____"+
				swapGender("Dibbler liked to describe himself as a merchant adventurer; everyone else liked to describe him as an itinerant pedlar whose money-making schemes were always let down by some small but vital flaw, such as trying to sell things he didnt own or which didnt work or, sometimes, didnt even exist"));
		System.out.println("The reverse of hello is "+reverse("Hello") );
		
		
	}
	
	}

