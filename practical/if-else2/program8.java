class Demo{
	public static void main(String[] args){
		
		float percent = 95.90f;

		if(percent>85.00){

			System.out.println("Passed first class with distinction");

		}else if(percent>=80.00 || percent<=85.00){
		
			System.out.println("Passed with  first class");

		}else if(percent>=70.00 || percent<80.00){
		
			System.out.println("Passed with second class");
		
		}else if(percent>=50.00 || percent<70.00){
		
			System.out.println("Pass");
		
		}else{
		
			System.out.println("Fail");
		
		}

	}
}
