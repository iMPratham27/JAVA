class IfElseDemo{
	public static void main(String[] args){
	
		int num = 0;

		if(true){
		
			System.out.println(num++ + ++num + ++num + ++num);
		}

		System.out.println(num - 10);

		System.out.println(num);
		
		if(num > 0){
		
			num = 10;
		}

		System.out.println(num);
	}
}
