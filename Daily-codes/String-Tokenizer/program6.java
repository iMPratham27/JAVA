import java.io.*;

class InputDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name: ");
                String name = br.readLine();

                System.out.print("Enter society name: ");
                String socName = br.readLine();

                System.out.print("Enter wing: ");
                char wing = (char)br.read();

		System.out.println("Name: " + name);
		System.out.println("Society name: " + socName);
		System.out.println("wing: " + wing);

                //System.out.print("Enter flat number: ");
                //int flatNo = Integer.parseInt(br.readLine());
        }
}
