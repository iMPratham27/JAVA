
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = 1;
		for(int i=1; i<=rows; i++){
		
			for(int space=rows; space>i; space--){
			
				System.out.print(" "+"\t");
			}

			for(int j=1; j<=2*i-1; j++){
			
				if(i%2==0){
				
					System.out.print((char)(64+i)+"\t");
				}else{
				
					System.out.print(num+"\t");
				}
			}
			num++;
			System.out.println();
		}
	}
}
