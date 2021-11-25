import java.lang.Character;
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println(Character.toUpperCase('v'));
		System.out.println(Character.toLowerCase('K'));
		System.out.println(Character.isLowerCase('U'));
		System.out.println(Character.isLetter('u'));
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.compare('9', '3'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isAlphabetic('9'));
		System.out.println(Character.valueOf('5'));
		char [] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
				
		for( int i=0; i<9; i++)
	{
		System.out.println(number[i]);
	
	}

}
	}