class SwitchDemo{

	public static void main(String[] args){
	
		int budget = 2500;

		if(budget<=15000 && budget>10000){
		
			System.out.println("Trip to Jammu & Kashmir");

		}else if(budget<=10000 && budget>6000){
		
			System.out.println("Trip to Manali");

		}else if(budget<=6000 && budget>2000){
		
			System.out.println("Trip to Amritsar");

		}else if(budget<=2000 && budget>1000){
		
			System.out.println("Trip to Mahabaleshwar");

		}else{
		
			System.out.println("Stay at your home!");
		}
	}
}
