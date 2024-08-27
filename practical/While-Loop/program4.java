class WhileDemo{

	public static void main(String[] args){
	
		int num = 1;
		for(int i=1; i<=6; i++){
		
			if(num%2==0){
			
				System.out.print(num + " ");
			}else{
			
				System.out.print((char)(num+64) + " ");
			}

			num++;
		}
	}
}
