
//binary input method
String binary2decimal(String s) {
	Console.println("Input binary number:");
	Console.print("> ");
	String binary1 = System.console().readLine();
	//check valid binary method
	boolean valid = isValidBinary(binary1);
	if (valid) {
		//read binary loop
		int value = 0;
		int length = binary1.length();
		
		for(int i = (length -1); i > -1 ; i--) {
			char c = binary1.charAt(i);
			char zero = '0';
			char one = '1';
			if (c.equals(one)) {
				value = value + (Math.pow(2, i));
			}
		}
		Console.println("Value of binary is: " + value);
	}	
}

// valid binary check
boolean isValidBinary(String s) {
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		char zero = '0';
		char one = '1';
		if (!Character.isDigit(c)) {
			Console.println("Not a valid binary A ");
			return false;
		}
		else {
			if (!c.equals(zero) || !c.equals(one)) {
				Console.println("Not a valid binary B");
				return false;
			}
		}
	}
	return true;
}

// decimal input method
String decimal2binary() {
	Console.println("Input decimal number:");
	Console.print("> ");
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
			Console.println("Not a valid number");
			return false;
		}
	}
	return true;
}

// main code
boolean running = true;

while (running) {
	Console.println("Input 1 for a binary input");
	Console.println("Input 2 for a decimal input");
	Console.println("Input 0 to exit");
	Console.print("> ");

	String input1 = System.console().readLine();
	int input = Integer.parseInt(input1);
	
	switch (input) {
		case 0: running = false;
		break;
		case 1: binary2decimal();
		break;
		case 2: //decimal input method
		break;
		default: Console.println("Invalid input, try again:");
	}
}