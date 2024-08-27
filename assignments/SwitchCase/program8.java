class SwitchDemo{

	public static void main(String[] args){
	
		int num1 = 1;
		int num2 = 1;
		int num = num1 * num2;

		if(num1>0 && num2>0){

			switch(num%2){
				
				case 0: System.out.println(num + " is an even number");
					break;

				case 1: System.out.println(num+ " is an odd number");
					break;	
			}
		
		}else{
		
			System.out.println("Sorry negative numbers are not allowed");
		}
	}
}
