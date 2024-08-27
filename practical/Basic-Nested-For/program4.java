class NestedFor{

	public static void main(String[] args){
	
		int rows = 3;
		char ch = 'A';
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=rows; j++){
			
				System.out.print(ch+" ");
				ch+=2;
			}
			System.out.println();
		}
	}
}
