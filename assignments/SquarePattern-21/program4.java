
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = rows;
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=rows; j++){
			
				if(j==1){
				
					System.out.print((char)(num+64)+"\t");
				}else{
				
					System.out.print(num+"\t");
				}
				num++;
			}
			System.out.println();
		}
	}
}
