class InputDemo{


        int x = 30;
        static int y = 40;

	void fun(){
	
		System.out.println("In fun method");
	}

	static void run(){
	
		System.out.println("In run method");
	}

        public static void main(String[] args){
		
		InputDemo obj = new InputDemo();
                System.out.println(obj.x);
                System.out.println(y);

		run();
		obj.fun();
        }
}
