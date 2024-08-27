
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		
		int num = 1;
		for(int i=1; i<=rows; i++){
		
			for(int space=1; space<i; space++){
			
				System.out.print("\t");
			}

			for(int j=1; j<=rows-i+1; j++){
			
				System.out.print(num+"\t");
				num++;
			}
			num = num - 1;
			System.out.println();
		}
	}
}
