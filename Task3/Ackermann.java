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

        System.out.print("The Ackermann of those numbers is: " + ackm(number1, number2));
    }

    private static int ackm(int m, int n) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Non-negative args only!");
        }

        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackm(m - 1, 1); // Final Case
        } else {
            return ackm(m - 1, ackm(m, n - 1));
        }
    }
}
