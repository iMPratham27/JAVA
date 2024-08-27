class SwitchDemo {

	public static void main(String[] args){
	
		String cloth_size = "XL";

		switch(cloth_size){
		
			case "S" : System.out.println("Small");
				   break;

			case "M" : System.out.println("Medium");
				   break;

			case "L" : System.out.println("Large");
				   break;

			case "XL" : System.out.println("Extra Large");
			            break;

			case "XXL" : System.out.println("Extra Extra Largs");
			 	     break;

			default : System.out.println("Enter proper cloth size");	     
		}
	}
}
