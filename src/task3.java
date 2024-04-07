/**
 * Checks whether a given integer is prime or not.
 * @param n The number to check for primality.
 * @param i The divisor to check if it divides n.
 * @return true if n is prime, false otherwise.
 * If the square of the current divisor exceeds n, n is prime
 * Recursively call isPrime with the next divisor
 * Output the result based on whether the number is prime or not
 */
import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isPrime = isPrime(n, 2);

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        scanner.close();
    }
}
