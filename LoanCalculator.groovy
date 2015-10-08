
// get our three initial double values
Console.println("Input initial amount borrowed in pounds:");
Console.print("> ");
String input = System.console().readLine();
double initial = Double.parseDouble(input);

Console.println("Input loan length in years:");
Console.print("> ");

input = System.console().readLine();
double years = Double.parseDouble(input);

Console.println("Input interest rate:");
Console.print("> ");

input = System.console().readLine();
double interest = Double.parseDouble(input);

double total = (initial * (1 + (interest/100)));
double perYear = total / years;
double totalInterest = total - initial;
double untilInterestPaid = totalInterest / perYear;

Console.println("\nTotal amount owed: \u00A3" + total);
Console.println("Amount to pay per year: \u00A3" + perYear);
Console.println("\nTotal interest owed: \u00A3" + totalInterest);
Console.println("Number of years before interest paid off: " + untilInterestPaid);

