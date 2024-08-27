
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

			char ch1 = 'A';
			char ch2 = 'a';
			for(int j=1; j<=2*i-1; j++){
			
				if(i%2==0){
				
					if(j>=i){
					
						System.out.print(ch2+"\t");
						ch2--;
					}else{
					
						System.out.print(ch2+"\t");
						ch2++;
					}
				}else{
				
					if(j>=i){
					
						System.out.print(ch1+"\t");
						ch1--;
					}else{
					
						System.out.print(ch1+"\t");
						ch1++;
					}
				}
			}

			System.out.println();
		}
	}
}
