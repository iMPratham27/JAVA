class NestedDemo{

        public static void main(String[] args){

                char ch1 = 'a';
                char ch2 = 'A';

                for(int i=1; i<=2; i++){

                        for(int j=1; j<=3; j++){

                                System.out.print(ch1++ + " ");
                        }
                        System.out.println();

                        for(int k=1; k<=3; k++){

                                System.out.print(ch2++ + " ");
                        }
                        System.out.println();
                }
        }
}
