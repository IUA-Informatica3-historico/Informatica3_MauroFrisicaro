package Task6_M;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int n, j, temp;
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        NodoBinario nodo = new NodoBinario();

        System.out.print("Cantidad de numeros enteros a ingresar: ");
        n = entrada.nextInt();
        System.out.println();
        j = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("Numero [%d]: ", j);
            temp = entrada.nextInt();

            if (i == 0) {
                nodo = new NodoBinario(temp, null, null);
                arbol.raiz = nodo;
                j++;
            } else {
                carga(arbol.raiz, nodo, temp);
                j++;
            }
        }

        System.out.printf("\nCantidad de niveles: %d", cantidadNiveles(arbol.raiz));
    }

    public static NodoBinario carga(NodoBinario r, NodoBinario t, int x) {
        if (t == null) {
            t = new NodoBinario(x, null, null);

            if (r == null) {
                return t;
            }

            if (x < r.dato) {
                r.izquierdo = t;
            } else {
                r.derecho = t;
            }

            return t;
        }

        if (x <= t.dato) {
            carga(t, t.izquierdo, x);
        } else {
            if (x > t.dato) {
                carga(t, t.derecho, x);
            }
        }

        return t;
    }

    public static int cantidadNiveles(NodoBinario a) {
        return 1 + Math.max(NodoBinario.altura(a.izquierdo), NodoBinario.altura(a.derecho));
    }
}
