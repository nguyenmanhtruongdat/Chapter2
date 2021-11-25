import java.util.Random;
public class Exercise3 {
	
	public static void main(String[] args) {
		Random rnd= new Random();
		int n1= rnd.nextInt();
		System.out.println("A random number is generated: " + n1 );
		
		int n2= rnd.nextInt(26); //0 to 25
		System.out.println("A random number is generated from 0 to 25: " + n2 );
		
		int n3= rnd.nextInt(21) + 6; //6 to 27
		System.out.println("A random number is generated from 6 to 27: " + n3);
	}
}
