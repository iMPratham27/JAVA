
// 'this' is the hidden parameter of constructor
// this can call to another constructor
// this should be first line in the constructor
// there should not be super() when u write this() 

class Demo3{

	int x = 10;

	Demo3(){
	
		this(10);
		System.out.println("In no-arg constructor");
	}
	
	Demo3(int x){
	
		this(10,20);
		System.out.println("In para1 constructor");
	}
	
	Demo3(int x, int y){
	
		System.out.println("In para2 constructor");
	}

	public static void main(String[] args){
	
		Demo3 obj = new Demo3();
	}
}
