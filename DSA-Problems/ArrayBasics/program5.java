

// Replace all 0's with 5


class ArrayDemo{

	public static void main(String[] args){
	
		String N = "1004";
		int i = Integer.parseInt(N);
		int replace = 0;

		while(i != 0){
		
			int rem = i % 10;
			if(rem == 0)
				rem = 5;
			replace = replace*10 + rem;

			i = i/10;
		}

		int ans = 0;
		while(replace != 0){
		
			int rem = replace%10;
			ans = ans*10 + rem;

			replace = replace/10;
		}

		System.out.println("N : 1004 and Replace : " + ans);
	}
}
