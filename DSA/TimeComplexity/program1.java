
import java.util.*;

/*  Brute-force approach
 
class SumOfN{
	
	static int sum(int num){
	
		int add = 0;
		for(int i=1; i<=num; i++){
		
			add = add + i;
		}

		return add;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = sc.nextInt();

		int ret = sum(num);

		System.out.println("Sum is: "+ret);
	}
}*/


//  Optimized approach
class SumOfN{

        static int sum(int num){

                int add = 0;
                
		add = (num * (num+1))/2;

                return add;
        }

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter num: ");
                int num = sc.nextInt();

                int ret = sum(num);

                System.out.println("Sum is: "+ret);
        }
}
