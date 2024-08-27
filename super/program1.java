
// due to inheritance , first line of constructor is super
// super => calls parent constructor and instialize its instance variable

class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{

	Child(){
	
		System.out.println("Child Constructor");
	}
}

class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
	}
}
