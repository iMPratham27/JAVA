
import java.util.*;

class InputDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();

		System.out.print("Enter your society name: ");
		String socName = sc.next();
		
		System.out.print("Enter wing: ");
		char wing = sc.next().charAt(0);
		
		System.out.print("Enter flat number: ");
		int flatNo = sc.nextInt();

		System.out.println("Name: " + name);

		System.out.println("Society Name: " + socName);
		
		System.out.println("Wing: " + wing);
		
		System.out.println("Flat number " + flatNo);
	}
}
