class SwitchDemo{
        public static void main (String[]args){
                char ch='B';
                        System.out.println("Before Switch");
                switch(ch){
                        case 'A':
                                System.out.println("A");
                                break;
                        case 65:
                                System.out.println("65");
                                break;
                        case 'B':
                                System.out.println("B");
                                break;
			case 66:
				System.out.println("66");
				break;
                        default:
                                System.out.println("In Default state");
                }
                System.out.println("After Switch");

        }
}
