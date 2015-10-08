class Integer2 {
	int value;

	int getValue() {
		return this.value;
	}

	void setValue(int value) {
		this.value = value;
	}

	boolean isEven() {
		if((this.value % 2) == 1) {
			return false;
		} else {
			return true;	
		}
	}

	boolean isOdd() {
		if((this.value % 2) == 0) {
			return false;
		} else {
			return true;	
		}
	}

	void prettyPrint() {
		Console.Println(this.value);
	}

	String toString() {
		String s = this.value;
		return s;
	}
}
Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
	println "odd.";
} else {
	println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}