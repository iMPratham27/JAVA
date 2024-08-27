import java.util.*;
class arrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size of Array: ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.print("Enter the Elements: ");
                for(int i=0;i<size;i++){

                        arr[i] = sc.nextInt();

                }
                int flag=0;
		int max=arr[0];
                for(int  i=1;i<arr.length;i++){
			if(arr[i]>max){
			
				max=arr[i];
			}else{
			
				flag++;
			}

                        

                }
		if(flag==0){

                System.out.print("Number is ascending : ");
		}else{
		System.out.print("Number is decending : ");
		}

        }

}
