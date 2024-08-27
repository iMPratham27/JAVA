class InputDemo{
	int x=10;
	static int y=20;

        void methodFun(){

                System.out.println("In Fun Method");
        }
        void methodgun(){

                System.out.println("In gun method");

        }
        void methodrun(){

                System.out.println("In run method");
        }

        public static void main(String[] args){
                InputDemo obj=new InputDemo();
                obj.methodFun();
                obj.methodgun();
                obj.methodrun();
		System.out.println(obj.x);
		System.out.println(obj.y);


        }


}
