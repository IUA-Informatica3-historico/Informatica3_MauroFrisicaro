package Task5_2;

import java.util.Scanner;

public class PolishNotation {
    private static int tos = -1;
    private static int numeros[] = new int[10];

    public static void main(String[] args) {
        String op;
        int x;
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA\n");

        System.out.println("+: Suma\n-: Resta\n*: Multiplicaci�n\n/: Divisi�n\n.: Mostrar �ltimo elemento\n!: Vaciar pila\nq: Salir\n");

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
                    System.out.printf("%d\n", numeros[tos]);
                }
            }

            if (op.compareTo("-") == 0) {
                if (tos < 1) {
                    if (tos == -1) {
                        System.out.println("\nLa pila est� vac�a\n");
                    } else {
                        System.out.println("\nCargue al menos dos operandos\n");
                    }
                } else {
                    resta();
                    System.out.printf("%d\n", numeros[tos]);
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
                    System.out.printf("%d\n", numeros[tos]);
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
                    System.out.printf("%d\n", numeros[tos]);
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
                x = Integer.parseInt(op);
                push(x);
                System.out.printf("%d\n", numeros[tos]);
            }
        }
        while (op.compareTo("q") != 0);
    }

    public static void push(int x) {
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

    public static int punto() {
        return numeros[tos];
    }
}

