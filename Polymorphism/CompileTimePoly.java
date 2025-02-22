/*	Compile time Polymorphism:
	- same name, different parameters
	- exists within single class
	- checks method signature

*/
class Demo{

	void fun(int x){
	
		System.out.println("In-fun-INT");
		System.out.println(x);
	}

	void fun(float x){
	
		System.out.println("In-fun-FLOAT");
		System.out.println(x);
	}

	public static void main(String[] args){
	
		Demo obj = new Demo();

		obj.fun(1);  // fun(INT)

		obj.fun(1.1f); // fun(FLOAT)
	}
}
