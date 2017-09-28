package Task3_4;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int dividend, divider;
        boolean flag = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Write the Dividend: ");
        dividend = input.nextInt();

        do {
            System.out.print("Write the Divider: ");
            divider = input.nextInt();

            if (divider == 0) {
                System.out.println("The Divider cant be zero.");
            } else {
                flag = false;
            }
        }
        while (flag);

        System.out.println();
        System.out.print(div(dividend, divider));
    }

    private static int divImpl(int a, int b) {
        return a >= b
                ? 1 + divImpl(a - b, b)
                : 0;
    }

    private static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero.");
        }
        int absVal = divImpl(Math.abs(a), Math.abs(b));
        return (a > 0 && b > 0) || (a < 0 && b < 0)
                ? absVal
                : -absVal;
    }
}