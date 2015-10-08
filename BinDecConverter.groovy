
//binary input method
int binary2decimal(String s) {
	Console.println("Input binary number:");
	Console.print("> ");
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
			pos++
		}
		Console.println(binary1 + " in decimal is: " + value);
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
			Console.println("Not a valid binary A ");
			return false;
		}
		else if ((c != zero) && (c != one)) {
				Console.println("Not a valid binary B");
				return false;
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
	boolean valid = isValidDecimal(decimal);
	if (valid) {
		int decimal1 = Integer.parseInt(decimal);
		String binary = "";
		String temp;
		int i = decimal1;
		while (i >= 1) {
			if ((i % 2) == 1) {
				temp = "1";
				binary = temp.concat(binary);
			} else {
				temp = "0";
				binary = temp.concat(binary);
			}
			i = i/2;
		}
	println(decimal + " in binary is: " + binary);	
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
		case 2: decimal2binary();
		break;
		default: Console.println("Invalid input, try again:");
	}
}