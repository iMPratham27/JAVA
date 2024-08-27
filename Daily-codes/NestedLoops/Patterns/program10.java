/*
 1 2 3

 A B C

 4 5 6

 D E F

*/

class NestedDemo{

	public static void main(String[] args){
	
		int num = 1;
		char ch = 'A';

		for(int i=1; i<=2; i++){
		
			for(int j=1; j<=3; j++){
			
				System.out.print(num++ + " ");
			}
			System.out.println();

			for(int k=1; k<=3; k++){
			
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
