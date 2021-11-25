import java.lang.StringBuffer;
public class Exercise2 {
	
	public static void main(String[] args) {
		
		StringBuffer str= new StringBuffer("VKU ");

		System.out.println(str); 
		System.out.println(str.append("University"));
		System.out.println(str.insert(0, "I am a student of "));
		
		// I am a student of VKU university
		
		System.out.println("Length of string: " + str.length());
		System.out.println("Index of 'University': "+ str.indexOf("University"));
		System.out.println("Char at 18: " + str.charAt(18));
		System.out.println(str.replace(0, 6, "Hello")); 
		System.out.println(str.delete(0, 6));
		System.out.println(str.substring(11));
		System.out.println(str.reverse());
		
	}

}
