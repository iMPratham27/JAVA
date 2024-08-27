
import java.util.*;

class ScannerDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter math marks: ");
		int math = sc.nextInt();

		System.out.print("Enter english marks: ");
		int english = sc.nextInt();

		System.out.print("Enter science marks: ");
		int science = sc.nextInt();

		System.out.print("Enter marathi marks: ");
		int marathi = sc.nextInt();

		int total = math+english+science+marathi;

		System.out.println(total+" marks out of 400");
	}
}
