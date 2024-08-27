class Demo{
	public static void main(String[] args){
		float marks = 90.00f;

		if(marks>80.00){

			System.out.println("Choose Medical");

		}else if(marks<=80.00 || marks>70.00){

			System.out.println("Choose Enginnering");

		}else if(marks<=70.00 || marks>=60.00){

			System.out.println("Choose pharmacy or bachelor in science");

		}else if(marks<60.00 || marks>=0){

			System.out.println("TERA KUCH NAHI HO SAKTA BRO!!");

		}else{

			System.out.println("Enter a valid number");

		}
	}
}
