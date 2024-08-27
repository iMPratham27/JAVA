
import java.util.*;

class ScannerDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();

		if(age>=18){
		
			System.out.println("Eligible for voting");

		}else if(age<0){
		
			System.out.println("Invalid Age");

		}else{
		
			System.out.println("Not eligible for voting");
		}
	}
}
