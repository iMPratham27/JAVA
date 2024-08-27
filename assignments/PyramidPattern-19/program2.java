
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
		
			for(int space=rows; space>i; space--){
			
				System.out.print(" "+"\t");
			}

			int num = 1;
			for(int j=1; j<=2*i-1; j++){
			
				System.out.print(num+"\t");
			}

			System.out.println();
		}
	}
}
