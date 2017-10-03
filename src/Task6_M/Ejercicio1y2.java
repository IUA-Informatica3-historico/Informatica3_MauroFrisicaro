package Task6_M;

import java.util.Scanner;

public class Ejercicio1y2 {
    public static void main(String[] args) {
        int n, j, temp;
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        NodoBinario nodo = new NodoBinario();

        System.out.println("Cargue 10 numeros enteros entre 0 y 25:\n");
        j = 1;

        for (int i = 0; i < 10; i++) {
            n = 0;

            do {
                System.out.printf("Numero [%d]: ", j);
                temp = entrada.nextInt();

                if (temp < 0 || temp > 25) {
                    System.out.println("\nEl nuumero ingresado no esta entre 0 y 25\n");
                } else {
                    if (i == 0) {
                        nodo = new NodoBinario(temp, null, null);
                        arbol.raiz = nodo;
                        n = 1;
                        j++;
                    } else {
                        carga(arbol.raiz, nodo, temp);
                        n = 1;
                        j++;
                    }
                }
            }
            while (n == 0);
        }

        System.out.print("\nArbol en orden: ");
        arbol.imprimirEnOrden();
    }

    public static NodoBinario carga(NodoBinario r, NodoBinario t, int x) {
        if (t == null) {
            t = new NodoBinario(x, null, null);

            if (r == null) {
                return t;
            }

            if (x <= r.dato) {
                r.izquierdo = t;
            } else {
                r.derecho = t;
            }

            return t;
        }

        if (x <= t.dato) {
            carga(t, t.izquierdo, x);
        } else {
            carga(t, t.derecho, x);
        }

        return t;
    }
}
