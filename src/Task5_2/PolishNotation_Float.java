package Task5_2;

import java.util.Scanner;

public class PolishNotation_Float {
    private static int tos = -1;
    private static double numeros[] = new double[10];

    public static void main(String[] args) {
        String op;
        double x;
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA\n");

        System.out.println("+: Suma\n-: Resta\n*: Multiplicacion\n/: Division\n.: Mostrar ultimo elemento\n!: Vaciar pila\nq: Salir\n");

        do {
            System.out.print(": ");
            op = entrada.next();

            if (op.compareTo("+") == 0) {
                if (tos < 1) {
                    if (tos == -1) {
                        System.out.println("\nLa pila esta vacia\n");
                    } else {
                        System.out.println("\nCargue al menos dos operandos\n");
                    }
                } else {
                    suma();
                    System.out.printf("%.2f\n", numeros[tos]);
                }
            }

            if (op.compareTo("-") == 0) {
                if (tos < 1) {
                    if (tos == -1) {
                        System.out.println("\nLa pila esta vacia\n");
                    } else {
                        System.out.println("\nCargue al menos dos operandos\n");
                    }
                } else {
                    resta();
                    System.out.printf("%.2f\n", numeros[tos]);
                }
            }

            if (op.compareTo("*") == 0) {
                if (tos < 1) {
                    if (tos == -1) {
                        System.out.println("\nLa pila esta vacia\n");
                    } else {
                        System.out.println("\nCargue al menos dos operandos\n");
                    }
                } else {
                    multiplicar();
                    System.out.printf("%.2f\n", numeros[tos]);
                }
            }

            if (op.compareTo("/") == 0) {
                if (tos < 1) {
                    if (tos == -1) {
                        System.out.println("\nLa pila esta vacia\n");
                    } else {
                        System.out.println("\nCargue al menos dos operandos\n");
                    }
                } else {
                    dividir();
                    System.out.printf("%.2f\n", numeros[tos]);
                }
            }

            if (op.compareTo("!") == 0) {
                vaciar();
                System.out.println("\nSe ha vaciado la pila\n");
            }

            if (op.compareTo(".") == 0) {
                if (tos == -1) {
                    System.out.println("\nLa pila esta vacia\n");
                } else {
                    System.out.println(punto());
                }
            }

            if (op.compareTo("+") != 0 && op.compareTo("-") != 0
                    && op.compareTo("!") != 0 && op.compareTo(".") != 0
                    && op.compareTo("*") != 0 && op.compareTo("/") != 0
                    && op.compareTo("q") != 0) {
                x = Double.parseDouble(op);
                push(x);
                System.out.printf("%.2f\n", numeros[tos]);
            }
        }
        while (op.compareTo("q") != 0);
    }

    public static void push(double x) {
        if (tos + 1 == numeros.length) {
            System.out.println("\nLa pila esta llena\n");
        } else {
            numeros[++tos] = x;
        }
    }

    public static void vaciar() {
        tos = -1;
    }

    public static void suma() {
        numeros[tos - 1] = numeros[tos] + numeros[tos - 1];
        tos--;
    }

    public static void resta() {
        numeros[tos - 1] = numeros[tos] - numeros[tos - 1];
        tos--;
    }

    public static void multiplicar() {
        numeros[tos - 1] = numeros[tos] * numeros[tos - 1];
        tos--;
    }

    public static void dividir() {
        if (numeros[tos - 1] == 0) {
            System.out.println("\nEl divisor es cero\n");
        } else {
            numeros[tos - 1] = numeros[tos] / numeros[tos - 1];
            tos--;
        }
    }

    public static double punto() {
        return numeros[tos];
    }
}
