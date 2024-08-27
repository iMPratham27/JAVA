class SwitchDemo{
        public static void main (String[]args){
                String friends="khana";
                        System.out.println("Before Switch");
                switch(friends){
                        case "ashish":
                                System.out.println("Barclays");
                                break;
                        case "khana":
                                System.out.println("BMC Software");
                                break;
                        case "Badhe":
                                System.out.println("IBM");
                                break;
                        default:
                                System.out.println("In Default state");
                }
                System.out.println("After Switch");

        }
}
