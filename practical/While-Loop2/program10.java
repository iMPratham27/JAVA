class WhileDemo{

        public static void main(String[] args){

                int num = 9367924;
                int rem = 0;
                int sum = 0;
		int product = 1;

                while(num!=0){

                        rem=num%10;

                        if(rem%2==1){

                                sum+=rem;
                        }else{
			
				product*=rem;
			}

                        num/=10;
                }

                System.out.println("Sum of even: "+sum);
		System.out.println("Product of odd: "+product);
        }
}
