class WhileDemo{

	public static void main(String[] args){
	
		int num = 50;

		while(num<=100){
		
			if(num%4==0 && num%7==0){
			
				System.out.println(num);
			}

			num++;
		}
	}
}
