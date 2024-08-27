class WhileDemo{

	public static void main(String[] args){
	
		long num = 9307922405L;
		long sum = 0L;
		long rem = 0L;

		while(num!=0){
		
			rem = num % 10;
			num/=10;

			sum = sum + rem;
		}

		System.out.println(sum);
	}
}
