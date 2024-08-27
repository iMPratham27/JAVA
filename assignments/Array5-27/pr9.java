import java.util.*;
class arrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
      

                System.out.print("Enter the no ");

                  int num = sc.nextInt();
		  int rev=0;
		  int temp=num;
		  int rem=0;
		 int count=0;
		  while(num>0){
		  	  rem=num%10;	  
			  rev=rem+rev*10;
			  count++;
			  num/=10;
			  
		  }
		  int arr[] = new int[count];
		  int i=0;
		  int rem1=0;
		  int rev1=0;
		  while(rev>0){
                          rem1=rev%10;
                          rev=rev/10;
			  arr[i]=rem1+1;
                          i++;

                  }
		 for(int j=0;j<count;j++){
		 	System.out.print(arr[j]+"\t");
		 }
		 

      }
}
