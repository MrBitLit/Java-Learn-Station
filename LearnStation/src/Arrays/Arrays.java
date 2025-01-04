package Arrays;

/**
 *
 * @author besic
 */
public class Arrays {

    public static void main(String args[]) {
        // ************ ARRAY RANDOM NUMBER VALUES ************
        int amntNums = 100000;
        int min = 0;
        int max = 100;
        double[] arDoubleNumbers = new double[amntNums];
        int[] arIntegerNumbers = new int[amntNums];

        System.out.println("Array with double values between 0.0 and 1.0:");

        for (int i = 0; i < amntNums; i++) {
            arDoubleNumbers[i] = Math.random();
            /* arDoubleNumbers random number between 0.0 and 1.0 */
            System.out.println(arDoubleNumbers[i]);
        }

        System.out.println("\nArray with fixed range of integer values "
                + "from min to max:");

        for (int i = 0; i < amntNums; i++) {
            // better random generator to control range
            arIntegerNumbers[i] = (int) ((Math.random() * (max - min + 1))
                    + min);
            /* Math.random returns double value that's why 
                            we need (int) to cast returned value to an 
                            integer value */

            // Print each line inside array
            System.out.println(arIntegerNumbers[i]);
        }

        // [0 ... 9]
        System.out.println("\n[0 ... 9]\n" + (int) (Math.random() * 10));
        // [1 ... 10]
        System.out.println("\n[1 ... 10]\n" + (int) ((Math.random() * 10) + 1));
        // [-5 ... 4]
        System.out.println("\n[-5 ... 4]\n" + ((int) (Math.random() * 10)
                - 5));
        //[-5 ... 5]
        System.out.println("\n[-5 ... 5]\n" + ((int) (Math.random() * 11) - 5));

        // ************ ARRAY FIND MAXIMUM OF ARRAY DOUBLE VALUES ************
        System.out.println("\n************ ARRAY FIND MAXIMUM OF ARRAY "
                + "DOUBLE VALUES ************");
        long startTime = System.nanoTime();
        
        double maxDouNum = Double.NEGATIVE_INFINITY;
        double minDouNum = Double.POSITIVE_INFINITY;

        for (int i = 0; i < arDoubleNumbers.length; i++) {
            if (arDoubleNumbers[i] > maxDouNum) {
                maxDouNum = arDoubleNumbers[i];
            } else {
                minDouNum = arDoubleNumbers[i];
            }
        }
        
        long endTime = System.nanoTime();
        double durationDouble = (endTime - startTime) / 1e6;

        System.out.println("Max: " + maxDouNum + "\nMin: " + minDouNum);

        // ************ ARRAY FIND MAXIMUM OF ARRAY INTEGER VALUES ************
        System.out.println("\n************ ARRAY FIND MAXIMUM OF ARRAY "
                + "INTEGER VALUES ************");
        startTime = System.nanoTime();
        int maxIntNum = Integer.MIN_VALUE;
        int minIntNum = Integer.MAX_VALUE;

        for (int i = 0; i < arIntegerNumbers.length; i++) {
            if (arIntegerNumbers[i] > maxIntNum) {
                maxIntNum = arIntegerNumbers[i];
            } else {
                minIntNum = arIntegerNumbers[i];
            }
        }
        
        endTime = System.nanoTime();
        double durationInt = (endTime - startTime) / 1e6; // 1e6 = 10^6, 1mio

        System.out.println("Max: " + maxIntNum + "\nMin: " + minIntNum);
        
        System.out.println("\nExecution Time:");
        System.out.println("Time taken for double array (seconds): " + 
                durationDouble + "s");
        System.out.println("Time taken for int array (seconds): " + 
                durationInt + "s");
    }
}
