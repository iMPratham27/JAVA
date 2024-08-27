
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i=rows; i>=1; i--){
			
			int num = rows;
			for(int space=rows; space>i; space--){
			
				System.out.print("\t");
			}

			for(int j=1; j<=2*i-1; j++){
			
				if(j>=i){
				
					System.out.print(num+"\t");
					num++;
				}else{
				
					System.out.print(num+"\t");
					num--;
				}
			}

			System.out.println();
		}
	}
}
