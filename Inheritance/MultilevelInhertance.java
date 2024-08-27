//	Multilevel Inheritance

class ICC{

	int players = 11;
	int teams = 2;
	
	ICC(){
	
		System.out.println("ICC is Parent Organization of all cricket boards");
	}

	void rules(){
	
		System.out.println("one over contains 6 balls ");
	}
}

class BCCI extends ICC{

	int budget = 16875;

	BCCI(){
	
		System.out.println("Richest cricket board in the world");
	}

	void owns(){
	
		System.out.println("BCCI owns IPL and WPL");
	}
}

class IPL extends BCCI{ 

	public static void main(String[] args){
	
		IPL obj = new IPL();
		System.out.println(obj.players);
		System.out.println(obj.teams);
		System.out.println(obj.budget);

		obj.rules();
		obj.owns();

	}
}
