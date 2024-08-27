class SwitchDemo{

	public static void main(String[] args){
	
		char grade = 'A';

		switch(grade){
		
			case 'O' : System.out.println("Outstanding");
				   break;

			case 'A' : System.out.println("Excellent");
				   break;

			case 'B': System.out.println("Good");
				  break;

			case 'C': System.out.println("Pass");
	  		          break;

			case 'D': System.out.println("Not upto the marks");
			          break;

			default : System.out.println("Enter proper grade");

		}
	}
}
