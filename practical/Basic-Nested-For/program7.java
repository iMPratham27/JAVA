class NestedFor{

        public static void main(String[] args){

                int rows = 3;
                for(int i=1; i<=rows; i++){
			
			char ch = 'c';
                        for(int j=1; j<=rows; j++){

                                System.out.print(ch+" ");
				ch--;
                        }
                        System.out.println();
                }
        }
}
