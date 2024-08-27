class Demo{
	public static void main(String[] args){
		int num = 52;

		if(num%13==0 && num<=130){
			System.out.println(num+" is in the table of 13");
		}else if(num%13==0){
			System.out.println(num+" is divisible by 13 but not in table of 13");
		}else{
			System.out.println(num+" is neither divisible by 13 nor in the table");
		}
	}
}
