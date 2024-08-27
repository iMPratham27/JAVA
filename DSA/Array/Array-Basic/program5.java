
class ArrayDemo{

	public static void main(String[] args){
	
		int num = 1004;
		int res = 0;
		int place = 1;
		while(num>0){
		
			int digit = num % 10;
			if(digit==0)
				digit = 5;

			res = res + digit*place;

			num = num/10;
			place = place*10;
		}

		System.out.println(res);
	}
}
