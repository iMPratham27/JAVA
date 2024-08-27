
import java.util.*;

class InputDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
			
			int ch = 96+rows;
			for(int j=1; j<=rows; j++){
			
				System.out.print((char)ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
