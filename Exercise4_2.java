import java.util.Date;
public class Exercise4_2 {

	public static void main(String[] args) {
		Date date= new Date();
		System.out.print("Time now: " +date.getHours() + "h");
		System.out.println(date.getMinutes() + "'");
		System.out.print(date.getDate() + "/");
		System.out.print(date.getMonth() + "/");
		System.out.print(date.getYear());
		
	}

}
