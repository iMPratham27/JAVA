
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
			
			int num = rows;
			int ch = num+64;
			for(int j=1; j<=rows; j++){
			
				if(i%2==0){
				
					System.out.print((char)ch+"\t");
					ch--;
				}else{
				
					if(j%2==0){
					
						System.out.print((char)ch+"\t");
					}else{
					
						System.out.print(num+"\t");
					}
					num--;
					ch--;
				}
			}
			System.out.println();
		}
	}
}
