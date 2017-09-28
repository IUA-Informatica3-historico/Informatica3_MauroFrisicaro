package Task3_7;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Write a Number: ");
        number = input.nextInt();
        number = Math.abs(number);
        parse(number);
    }

    private static void parse(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        parse(n / 10);
        System.out.print(n % 10 + " ");
    }
}
