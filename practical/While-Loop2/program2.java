class WhileDemo{

	public static void main(String[] args){
	
		int num = 2569185;
		int rem = 0;

		while(num!=0){
		
			rem = num % 10;
			num/=10;

			if(rem%3==0){
			
				
			}else{
			
				System.out.println(rem);
			}

		}
	}
}
