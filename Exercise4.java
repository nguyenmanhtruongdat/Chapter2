import java.util.Scanner;
import java.lang.Math;
public class Exercise4 {

	public static void main(String[] args) {
		double a;
		double b;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter number A: ");
		a= scanner.nextDouble();
		System.out.println("Enter number B:  ");
		b= scanner.nextDouble();
		
		System.out.println(Math.nextUp(a));
		System.out.println("Min of a, b= " + Math.min(a, b));
		System.out.println("Max of a, b= " + Math.max(a, b));
		System.out.println("Absolute value of A= " + Math.abs(a));
		System.out.println("The cube root of A= " + Math.cbrt(a));
		System.out.println("The square root of A= " + Math.sqrt(a));
		System.out.println("A^5= " + Math.pow(a, 5));
		System.out.println("Square of A= " + Math.pow(a, 2));
		System.out.print("The sum of 123 and 7510= " + Math.addExact(123, 7510));
	
	}

}
