public class RecursionPractice {

    // Recursive version for getting the power of tens
    public static int getPowerOfTens(int number) {
        if (number == 0) {
            return 1;
        }
        return 10 * getPowerOfTens(number - 1);
    }

    // Loop version for getting the power of tens
    public static int getPowerOfTensLoop(int number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= 10;
        }
        return result;
    }

    // Example for another problem from the CodingBat practice
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Loop version of factorial
    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Add more methods from CodingBat here...

    public static void main(String[] args) {
        // Testing the methods
        System.out.println(getPowerOfTens(3)); // Output: 1000
        System.out.println(getPowerOfTensLoop(3)); // Output: 1000

        System.out.println(factorial(5)); // Output: 120
        System.out.println(factorialLoop(5)); // Output: 120
    }
}
