
// due to inheritance , first line of constructor is super
// super => calls parent constructor and instialize its instance variable

class Parent{
	
	int x = 10;
	int y = 20;
	Parent(){
	
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{

	int x = 30;
	int y = 40;
	Child(){
	
		System.out.println("Child Constructor");
	}
}

class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
