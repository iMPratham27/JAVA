
import java.util.*;

class ScannerDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();

		for(int i=num1; i<=num2; i++){
		
			System.out.println(i);
		}
	}
}
