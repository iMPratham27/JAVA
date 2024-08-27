class Demo{
	public static void main(String[] args){
		int sellingPrice = 300;
		int costPrice = 500;

		if(sellingPrice>costPrice){

			System.out.println("Profit is: "+(sellingPrice-costPrice));

		}else if(sellingPrice<costPrice){
			
			System.out.println("Loss is: "+(costPrice-sellingPrice));

		}else{
		
			System.out.println("No profit, no loss");

		}
	}
}
