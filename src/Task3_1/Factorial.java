package Task3_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Write a number: ");
        number = input.nextInt();

        factNum(number);
    }

    private static long factNum(int n) {
        System.out.println();

        if (n == 1) {
            System.out.print(n + "\n");
            return 1;
        }

        for (int i = 0; i < (n - 1); i++) {
            System.out.print("\t");
        }

        System.out.println(n);

        long result = factNum(n - 1) * n;

        for (int i = 0; i < (n - 1); i++) {
            System.out.print("\t");
        }

        System.out.println(result);
        return result;
    }
}