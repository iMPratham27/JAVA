class SwitchDemo{

	public static void main(String[] args){
	
		int java = 90;
		int oop = 87;
		int dsa = 80;
		int dbms = 85;
		int cns = 60;

		int total_marks = java + oop + dsa + dbms + cns;
		int all_sub = 5;
		int avg = total_marks / all_sub;

		if(java>=35 && oop>=35 && dsa>=35 && dbms>=35 && cns>=35){
		
			switch(avg/10){
			
				case 9: System.out.println("First Class with Distiction");
					break;

				case 8: System.out.println("First Class");
					break;

				case 7: System.out.println("Second class");
					break;

				case 6: System.out.println("Average score");
					break;

				default: System.out.println("Just Pass");	

			}

		}else{
		
			System.out.println("You are failed");
		}	
	}
}
