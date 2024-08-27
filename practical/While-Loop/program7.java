class WhileDemo{

	public static void main(String[] args){
	
		int num = 93079224;
		int rem = 0;
		int count = 0;

		while(num!=0){
		
			rem = num % 10;
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}
