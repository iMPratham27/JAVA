/*
  a b c
  a b c
  a b c
*/

class NestedDemo{

	public static void main(String[] args){

		for(int i=1; i<=3; i++){
					
			int ch = 97;
			for(int j=1; j<=3; j++){
			
				System.out.print((char)ch++ + " ");  // typecast
			}
			System.out.println();	
		}
	}
}
