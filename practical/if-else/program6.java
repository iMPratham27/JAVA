class Demo{
	public static void main(String[] args){
		int num = 507;
		if(num%3==0){
			if(num%7==0){

				System.out.println(num+" is divisible by both 3 and 7");

			}else{	

				System.out.println(num+" is divisible by 3");

			}
		}else if(num%7==0){

				System.out.println(num+" is divisible by 7");

		}else{

				System.out.println(num+" is not divisible by both 3 and 7");

		}
	}
}
