package BasicConceptsAndControlStructures;

/**
 *
 * @author besic
 */
public class IfStatement {

    public static void main(String args[]) {
        int x = -9;
        int y = 8;
        System.out.println("Starting values: \n" + "x: " + x + "\n" + "y: "
                + y + "\n");

        // ************ ABSOULUTE VALUE ************ 
        if (x < 0) {
            x = -x; // -9 is 9 because -9 -9 = 9 or -(-9) = 9
        }
        System.out.println("************ ABSOULUTE VALUE ************\n"
                + "x absolute value: " + x);

        // ******* SMALLER VALUE IN X, LARGER VALUE IN Y VALUE *******
        if (x > y) {
            int t = x; // x value is saved in temporary variable t
            System.out.println("\n******* SMALLER VALUE IN X, LARGER VALUE "
                    + "IN Y VALUE *******\nt: " + t + "; x: " + x + ";");
            x = y; // x is y now, so 8
            System.out.println("x: " + x + "; y: " + y + ";");
            y = t; // y has x first value which was 10
            System.out.println("y: " + y + "; t: " + t + ";");
        }

        int max = 0;
        // ************ MAXIMUM OF X AND Y ************
        System.out.println("\n************ MAXIMUM OF X AND Y ************");
        if (x > y) {
            max = x;
            System.out.println("Max x: " + x + ";");
        } else {
            max = y;
            System.out.println("Max y: " + y + ";");
        }

        int num = 14;
        int den = 0;
        // ************ ERROR CHECK FOR DIVISION OPERATION ************
        System.out.println("\n************ ERROR CHECK FOR DIVISION OPERATION "
                + "***********");
        if (den == 0) {
            System.out.println("Division by zero");
        } else {
            System.out.println("Quotient = " + num / den);
        }

        // ************ ERROR CHECK FOR QUADRATIC FORMULA ************
        double b = 127.24;
        double c = 190.29;
        double discriminant = b * b - 4.0 * c;
        System.out.println("\n************ ERROR CHECK FOR QUADRATIC FORMULA "
                + "************");
        if (discriminant < 0.0) {
            System.out.println("No real roots.");
        } else {
            System.out.println((-b + Math.sqrt(discriminant)) / 2.0);
            System.out.println((-b - Math.sqrt(discriminant)) / 2.0);
        }

        // ************ NESTED IF ELSE STATEMENT ************
        int income = 150750;
        double rate = 0.0;
        double exchangeRate = 0.96; // 1 USD is 0,96 Euros
        double incomeInEuros = income * exchangeRate;

        System.out.println("\n************ NESTED IF ELSE STATEMENT "
                + "************");
        if (income < 0) {
            rate = 0.00;
        } else if (income < 8925) {
            rate = 0.1050;
        } else if (income < 36250) {
            rate = 0.1510;
        } else if (income < 87850) {
            rate = 0.2325;
        } else if (income < 183250) {
            rate = 0.2845;
        } else if (income < 398350) {
            rate = 0.3320;
        } else if (income < 400000) {
            rate = 0.3555;
        } else {
            rate = 0.3965;
        }
        // Steps:
        // rate * 10000 = 2845.0
        // Math.floor(2845.0) = 2845.0
        // 2845.0 / 100.0 = 28.45
        rate = Math.floor(rate * 10000) / 100.0;
        System.out.println("Income: $" + income);
        System.out.println("Income: " + incomeInEuros + "€");
        System.out.println("Rate: " + rate + "%");
    }
}
