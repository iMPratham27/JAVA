class WhileDemo{

	public static void main(String[] args){
	
		int sum = 0;
		int i = 101;
		while(i<=150){
		
			if(i%2==1){
			
				sum = sum + i;	
			}
			i++;
		}
		System.out.println(sum);
	}
}
