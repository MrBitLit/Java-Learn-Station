package BasicConceptsAndControlStructures;

/**
 *
 * @author besic
 */
public class WhileLoop {

    public static void main(String args[]) {
        // ***************** WHILE LOOP *****************
        System.out.println("\n***************** WHILE LOOP **************"
                + "***");
        int power = 1;
        int n = 128;
        while (power <= n / 2) {
            System.out.println(power = 2 * power);
        }

        // ***************** BREAK STATEMENT *****************
        System.out.println("\n***************** BREAK STATEMENT "
                + "*****************");
        int factor;
        n = 11;
        for (factor = 2; factor <= n / factor; factor++) {
            if (n % factor == 0) {
                break; // Breaks after first factor is found
            }
        }
        if (factor > n / factor) {
            System.out.println(n + " is prime");
        }

        // ***************** DO WHILE *****************
        System.out.println("\n***************** DO WHILE *****************");
        int c1 = 0;

        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print Statement");
            c1++; // This must be executed, so c1 has value 1 now
        } while (c1 < 0);
        /* This condition is false now because c1 is bigger 
                        than 0 now */

    }
}
