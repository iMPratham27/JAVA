import java.io.*;

class InputDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter your name: ");
                String name = br.readLine();

                System.out.print("Enter society name: ");
                String socName = br.readLine();

                System.out.print("Enter wing: ");
                char wing = br.readLine();

                System.out.print("Enter flat number: ");
                String flatNo = br.readLine();
        }
}
