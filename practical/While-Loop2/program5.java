class WhileDemo{

        public static void main(String[] args){

                int num = 256985;
                int rem = 0;

                while(num!=0){

                        rem = num%10;
                        num/=10;

                        if(rem%2==0){

                                System.out.println(rem*rem*rem);
                        }
                }
        }
}
