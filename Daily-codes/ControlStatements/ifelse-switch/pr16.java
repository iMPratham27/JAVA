class SwitchDemo{
        public static void main (String[]args){
                char ch='A';
                        System.out.println("Before Switch");
                switch(ch){
                        case 'A':
                                System.out.println("A");
                                break;
                        case 'B':
                                System.out.println("B");
                                break;
                        case 'C':
                                System.out.println("C");
                                break;
                        default:
                                System.out.println("In Default state");
                }
                System.out.println("After Switch");

        }
}
