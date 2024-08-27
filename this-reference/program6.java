
class Demo4{

	int x = 0;

	Demo4(int x){
	
		this.x = x;
		System.out.println("in constructor");
	}

	void fun(int x){
	
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args){
	
		Demo4 obj = new Demo4(120);

		obj.fun(50);
	}
}
