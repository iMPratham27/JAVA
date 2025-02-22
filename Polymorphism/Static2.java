
// static methods and instance variables are resolved at compile-time(jyacha reference -> tyachi method call)

class Parent{

	int x = 10;

	static void fun(){
	
		System.out.println("In-fun-Parent");
	}

}

class Child extends Parent{

	int x = 20;

	static void fun(){
	
		System.out.println("In-fun-Child");
	}
}

class Client{

	public static void main(String[] args){
	
		Parent obj = new Parent();
		obj.fun();
		System.out.println(obj.x);

		Child obj1 = new Child();
		obj1.fun();
		System.out.println(obj1.x);

		Parent obj2 = new Child();
		obj2.fun(); // In-fun-Parent (Reference => Parent)        
		System.out.println(obj2.x); // 10
	}
}
