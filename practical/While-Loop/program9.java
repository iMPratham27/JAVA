class WhileDemo{

	public static void main(String[] args){
	
		int num = 214367689;
		int rem = 0;
		int evenCount = 0;
		int oddCount = 0;

		while(num!=0){
		
			rem = num % 10;
			num/=10;

			if(rem%2==1){
			
				oddCount++;
			}else{
			
				evenCount++;
			}
		}

		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);
	}
}
