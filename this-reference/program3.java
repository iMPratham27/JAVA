
class Demo1{

	Demo1(){
	
		System.out.println("In constructor");
		System.out.println(this);	//123
	}

	public static void main(String[] args){
	
		Demo1 obj = new Demo1();
		System.out.println(obj);	//123
	}
}
