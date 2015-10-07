public class BinDecConverter {
	public static void main(String[] args) {
		// main code
		boolean running = true;

		while (running) {
			System.out.println("Input 1 for a binary input");
			System.out.println("Input 2 for a decimal input");
			System.out.println("Input 0 to exit");
			System.out.print("> ");

			String input1 = System.console().readLine();
			int input = Integer.parseInt(input1);
	
			switch (input) {
				case 0: running = false;
				break;
				case 1: binary2Decimal();
				break;
				case 2: //decimal input method
				break;
				default: System.out.println("Invalid input, try again:");
			}
		}
				
		//binary input method
		String binary2Decimal() {
			System.out.println("Input binary number:");
			System.out.print("> ");
			String binary1 = System.console().readLine();
			//check valid binary method
			boolean valid = isValidBinary(binary1);
			if (valid) {
				//read binary loop
				int value = 0;
				int length = binary1.length();
				//loop counter variable 
				int pos = 0;
				for(int i = (length -1); i > -1 ; i--) {
					char c = binary1.charAt(i);
					char zero = '0';
					char one = '1';
					// use loop counter as exponent
					if (c.equals(one)) {
						value = value + (Math.pow(2, pos));
					}
					pos++;
				}
				System.out.println("Value of binary is: " + value);
				return value;
			}
	
		}

		// valid binary check
		boolean isValidBinary(String s) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				char zero = '0';
				char one = '1';
				if (!Character.isDigit(c)) {
					System.out.println("Not a valid binary A ");
					return false;
				}
				else if ((c != zero) && (c != one)) {
						System.out.println("Not a valid binary B");
						return false;
					}
			}
			return true;
		}

		// decimal input method
		String decimal2binary() {
			System.out.println("Input decimal number:");
			System.out.print("> ");
			String decimal = System.console().readLine();
			// check valid decimal
			boolean valid = isValidDecimal();
			if (valid) {
				int decimal1 = Integer.parseInt(decimal);
		
				
			}
		}

		//decimal valid method
		boolean isValidDecimal(String s) {
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!Character.isDigit(c)) {
					System.out.println("Not a valid number");
					return false;
				}
			}
			return true;
		}

		
	}
}