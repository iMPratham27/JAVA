
class Demo2{

	int x = 10;

	Demo2(int x){
	
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	
	// 'this' is used to differentiate between instance(global) variable and local variable

	public static void main(String[] args){
	
		Demo2 obj = new Demo2(20);
	}
}
