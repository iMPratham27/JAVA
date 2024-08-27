class WhileDemo{

	public static void main(String[] args){
	
		int num = 256985;
		int rem = 0;
		int sum = 0;

		while(num!=0){
		
			rem=num%10;

			if(rem%2==0){
			
				sum+=rem;
			}

			num/=10;
		}

		System.out.println(sum);
	}
}
