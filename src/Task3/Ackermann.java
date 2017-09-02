/* The Ackermann Function
            n+1                 if m = 0
    A(m, n) A(m-1, 1)           if m > 0 and n = 0
            A(m-1, A(m, n-1))   if m > 0 and n < 0
*/

// VM Options: -Xss 100M

package Task3;

import java.util.Scanner;

public class Ackermann {
    public static void main(String args[]) {
        int number1, number2;
        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        number1 = input.nextInt();

        System.out.print("Second Number: ");
        number2 = input.nextInt();

        System.out.print("The Ackermann of those numbers is: " + ackermann(number1, number2));
    }

    private static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Only positive numbers allowed.");
        }

        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackermann(m - 1, 1); // Final Case
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
