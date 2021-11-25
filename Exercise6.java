import java.util.*;;
class Company{
	String name, address;
	float cost, benefit, income;
	String phoneNumber;
	public void enterInfor() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter company name: ");
		this.name= scanner.nextLine();
		System.out.println("Enter company address: ");
		this.address= scanner.nextLine();
		System.out.println("Enter company phone number: ");
		this.phoneNumber= scanner.nextLine();
		System.out.println("Enter income: ");
		this.income= scanner.nextFloat();
		System.out.println("Enter cost: ");
		this.cost= scanner.nextFloat();
		this.benefit= this.benefitCALC();
}
	public float benefitCALC() {
		return this.income - this.cost; 
	}
	public void displayInfor() {
		System.out.println("Company name: "+ this.name);	
		System.out.println("Company address: "+ this.address);	
		System.out.println("Company phone number: "+ this.phoneNumber);
		System.out.println("Income: "+ this.income);	
		System.out.println("Cost: "+ this.cost);	
		System.out.println("Benefit: "+ this.benefit);	
		
	}
}

public class Exercise6 {
	public static void main(String[] args) {
		Company company = new Company();
		company.enterInfor();
		company.displayInfor();
	}
}