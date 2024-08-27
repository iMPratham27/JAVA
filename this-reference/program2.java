
class Demo{
	
	int x = 10;
	int y = 20;

	Demo(int x, int y){
		
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(y);

		this.x = x;	// this.x => instance variable
		this.y = y;	// this.y => instance variable

		// this assigns constructor x & y to instance x & y. Hence change the value of instance x & y
	}

	void printData(){
		
		System.out.println(x);
		System.out.println(y);
	}

}

class ConstrDemo{
	
	public static void main(String[] args){
	
		Demo obj = new Demo(30,40);
		obj.printData();
	}
}
