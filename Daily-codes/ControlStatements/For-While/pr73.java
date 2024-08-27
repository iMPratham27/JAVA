class  NestedFor{

        public static void main(String[] args){
                //int num=1;
                
                for(int i=1;i<=4;i++){
			int ch=65;
			int ch1=97;
                        for(int j=1;j<=4;j++){
                               if(i%2==1){

                                System.out.print((char)ch+" ");
                                 ch++; 
                                }else{
                                        System.out.print((char)ch1+" ");
					ch1++;	
                                        
                                }
                        }
                        System.out.println();
                }

        }

}
