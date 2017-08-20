/*  4. Implemente un programa que ingresada una función matemática, verifique si la
    cantidad de (,[,{ que abren están balanceados con los que cierran. */

package Task1_4;

import java.util.Scanner;
import java.lang.String;

public class MathChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mathematical Function to Check: ");

        if (checkExpression(input.next())) {
            System.out.print("The Function is balanced.");
        } else {
            System.out.print("The Function is not balanced.");
        }
    }

    static boolean checkExpression(String txt) {
        int x = 0, y = 0, z = 0;
        boolean error = false;
        int kind = -1;

        for (int i = 0; i < txt.length() && !error; ++i) {
            switch (txt.charAt(i)) {
                case '(':
                    ++x;
                    kind = 0;
                    break;

                case ')':
                    --x;
                    error = (x < 0);
                    if (!error && kind != 0) {
                        if (kind == 1) {
                            error = (y != 0);
                        }
                        if (kind == 2) {
                            error = (z != 0);
                        }
                    }
                    kind = 0;
                    break;

                case '[':
                    ++y;
                    kind = 1;
                    break;

                case ']':
                    --y;
                    error = (y < 0);
                    if (!error && kind != 1) {
                        if (kind == 0) {
                            error = (x != 0);
                        }
                        if (kind == 2) {
                            error = (z != 0);
                        }
                    }
                    kind = 1;
                    break;

                case '{':
                    ++z;
                    kind = 2;
                    break;

                case '}':
                    --z;
                    error = (z < 0);
                    if (!error && kind != 2) {
                        if (kind == 1) {
                            error = (y != 0);
                        }
                        if (kind == 0) {
                            error = (x != 0);
                        }
                    }
                    kind = 2;
                    break;
            }
        }
        return (x == 0) && (y == 0) && (z == 0);
    }
}
