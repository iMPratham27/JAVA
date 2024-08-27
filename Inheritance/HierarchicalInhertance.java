//	Hierarchical Inheritance

class Milk{
	
	Milk(){
	
		System.out.println("Main ingredient");
	}
}

class Tea extends Milk{
	
	int teaPowder = 5;
	int sugar = 2;

	Tea(){
	
		System.out.println("Masala chai or Adrak chai");
	}
}

class Coffee extends Milk{

	int coffeePowder = 6;

	Coffee(){
	
		System.out.println("cold coffee or hot coffee");
	}
}

class Person{

	public static void main(String[] args){
	
		Coffee obj = new Coffee();
		System.out.println(obj.coffeePowder);
	}
}
