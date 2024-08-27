class Demo{
	public static void main(String[] args){
	
		int actualPin = 1234;
		int pin = 1234;
		int requiredAmount = 4000;
		int balance = 5000;

		if(pin == actualPin){
		
			if(balance > requiredAmount){
			
				System.out.println(requiredAmount+" debited");
			
			}else {
			
				System.out.println("Insufficient balance");
			
			}

		}else {
		
			System.out.println("Wrong pin");
		
		}
	}
}
