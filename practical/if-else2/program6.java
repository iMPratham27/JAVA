class Demo{
	public static void main(String[] args){
		int age = -31;

		if(age>=18 && age>0){

			System.out.println(age+" is a valid age for voting");

		}else if(age<18 && age>0){

			System.out.println(age+" is not a valid age for voting");

		}else{
			
			System.out.println(age+" is an invalid age");
		}
	}
}
