//	Single Inheritance

class Porsche{

	int engine = 1;
	int tyres = 4;
	int airbags = 4;
	
	Porsche(){
	
		System.out.println("German car");
	}
}

class GTthree extends Porsche{

	String color = "Nardo-grey";
	int topSpeed = 320;

	void performance(){
	
		System.out.println("Best performance with great aerodynamics and larger downforce");
	}

	GTthree(){
	
		System.out.println("GT3 is one of the best Porsche.");
	}

	public static void main(String[] args){
	
		GTthree obj = new GTthree();

		System.out.println(obj.color);
		System.out.println(obj.topSpeed);
		System.out.println(obj.engine);

		obj.performance();

	}
}
