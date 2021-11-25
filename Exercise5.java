import java.util.*;
public class Exercise5 {

		String name,ID, address, Class;
		Date birthday;
		float subj1, subj2, subj3, averMarks;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name: ");
		name=scanner.nextLine();
		System.out.println("Enter student ID: ");
		ID=scanner.nextLine();
		System.out.println("Enter class of student: ");
		Class=scanner.nextLine();
		System.out.println("Enter student address: ");
		address=scanner.nextLine();
		System.out.println("Enter date of birth");
		System.out.println("Day: ");
		int day=scanner.nextInt();
		System.out.println("Month: ");
		int month=scanner.nextInt();
		System.out.println("Year: ");
		int year=scanner.nextInt();
		birthday = new Date(year, month, day);
		
		scanner.nextLine();
		System.out.println("Subjects marks 1: ");
		subj1= scanner.nextFloat();
		System.out.println("Subjects marks 2: ");
		subj2= scanner.nextFloat();
		System.out.println("Subjects marks 3: ");
		subj3= scanner.nextFloat();
	}
	public void output() {
		System.out.println("Student name: "+ name);
		System.out.println("Student ID: "+ ID);
		System.out.println("Class: "+ Class);
		System.out.println("Date of birth: " + birthday.getDate() + "/" + birthday.getMonth() + "/" + birthday.getYear());
		System.out.println("Subjects marks 1: " + subj1);
		System.out.println("Subjects marks 2: " + subj2);
		System.out.println("Subjects marks 3: " + subj3);
		System.out.println("Average Marks: " + ( subj1 + subj2 + subj3)/3 );
	}
	
	public static void main(String[] args) {
		Exercise5 A= new Exercise5();
		A.input();
		A.output();

	}

}
