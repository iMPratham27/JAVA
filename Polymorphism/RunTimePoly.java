/*

   	Run Time Polymorphism:
	- exists in two classes
	- required parent-child relation
	- method signature and return type should be same
	- covarient(Parent-Child relation) return type is allowed when return type is class
	- can not override final methods 

*/

class Parent{

	void buy(){
	
		System.out.println("Simple laptop");
	}
}

class Child extends Parent{

	void buy(){
	
		System.out.println("Gaming laptop");
	}
}

class Client{

	public static void main(String[] args){
	
		Child obj = new Child();

		Parent obj1 = new Parent();

		Parent obj2 = new Child(); 

		obj2.buy();
	}
}
