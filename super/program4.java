

class Parent{
	
	int x = 10;

	Parent(){
	
		System.out.println("Parent Constructor");
	}

	void fun(){
	
		System.out.println("In-fun parent");
	}
}

class Child extends Parent{

	int y = 20;

	Child(){
	
		System.out.println("Child Constructor");
	}

	void run(){
	
		System.out.println("In-run child");
	}
}

class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		obj.fun();
		obj.run();
	}
}
