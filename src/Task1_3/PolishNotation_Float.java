/*  3. Modifique el programa anterior para que la calculadora de 4 funciones trabaje
    con números en punto flotante. */

package Task1_3;

import java.util.Scanner;

public class PolishNotation_Float {
    public static void main(String[] args) {
        Stack math = new Stack();
        String op;
        double x;

        Scanner input = new Scanner(System.in);

        System.out.println("Polish Calculator\nOperations: + - * /\nShow Last Element: .\nEmpty: !\nExit: q\n");

        do {
            System.out.print(": ");
            op = input.next();

            switch (op) {
                case "+":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nEmpty Stack.\n");
                        } else {
                            System.out.println("\nWrite at least two chars.\n");
                        }
                    } else {
                        math.add();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "-":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nEmpty Stack.\n");
                        } else {
                            System.out.println("\nWrite at least two chars.\n");
                        }
                    } else {
                        math.sub();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "*":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nEmpty Stack.\n");
                        } else {
                            System.out.println("\nWrite at least two chars.\n");
                        }
                    } else {
                        math.mul();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "/":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nEmpty Stack.\n");
                        } else {
                            System.out.println("\nWrite at least two chars.\n");
                        }
                    } else {
                        math.div();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "!":
                    math.empty();
                    System.out.println("\nThe stack now is empty.\n");
                    break;

                case ".":
                    if (math.top == -1) {
                        System.out.println("\nThe stack is empty.\n");
                    } else {
                        System.out.println(math.top);
                    }
                    break;

                default:
                    x = Integer.parseInt(op);
                    math.push(x);
                    System.out.printf("%d\n", math.top());
            }
        }
        while (op.compareTo("q") != 0);
    }
}
