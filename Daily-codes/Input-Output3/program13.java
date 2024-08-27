import java.io.*;

class InputDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter company name: ");
                String cmpName = br.readLine();

                System.out.print("Enter employee name: ");
                String empName = br.readLine();

                System.out.print("Enter employee id: ");
                int empId = Integer.parseInt(br.readLine());

                System.out.print("Enter employee salary: ");
                double empSal = Double.parseDouble(br.readLine());
                
		System.out.println("Company Name: "+ cmpName);

                System.out.println("Employee Name: "+ empName);

                System.out.println("Employee Id: "+ empId);

                System.out.println("Employee Salary: "+ empSal);
        }
}
