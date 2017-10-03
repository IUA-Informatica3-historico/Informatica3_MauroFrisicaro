package Task6_M;

import java.util.Scanner;

public class Ejercicio4Arbol {
    public static void main(String args[]) {
        int n, bandera, elemento;
        Scanner entrada = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        NodoBinario nodob = new NodoBinario();
        System.out.println("Cargue 10 numeros enteros entre 0 y 25:\n");
        for (int i = 0; i < 10; i++) {
            bandera = 0;
            do {
                System.out.println("Ingrese elemento: ");
                elemento = entrada.nextInt();
                if (elemento < 0 || elemento > 25) {
                    System.out.println("\nIngreso invalido\n");
                } else {
                    if (i == 0) {
                        nodob = new NodoBinario(elemento, null, null);
                        arbol.raiz = nodob;
                        bandera = 1;
                    } else {
                        stree(elemento, arbol.raiz, nodob);
                        bandera = 1;
                    }
                }
            }
            while (bandera == 0);
        }
        System.out.print("\nArbol ingresado: ");
        arbol.imprimirEnOrden();
        System.out.println("Seleccione elemento a eliminar: ");
        int x = entrada.nextInt();
        dtree(arbol.raiz, x);
        System.out.println("Arbol resultante despues de la eliminacion");
        arbol.raiz.imprimirEnOrden();
    }

    public static NodoBinario stree(int x, NodoBinario r, NodoBinario t) {
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

        if (x <= t.dato) //datos duplicados, a la derecha
        {
            stree(x, t, t.izquierdo);
        } else {
            stree(x, t, t.derecho);
        }

        return t;
    }

    public static NodoBinario dtree(NodoBinario raiz, int key) {
        NodoBinario p, p2;
        if (raiz == null) {
            System.out.println("La raiz es nula");
            return raiz;
        }
        if (raiz.dato == key) {
            //arbol vacio
            if (raiz.izquierdo == raiz.derecho) {
                return null;
            }
            //un sub-arbol es nulo
            else if (raiz.izquierdo == null) {
                p = raiz.derecho;
                return p;
            } else if (raiz.derecho == null) {
                p = raiz.izquierdo;
                return p;
            }
            //ambos sub-arboles presentes
            else {
                p2 = raiz.derecho;
                p = raiz.derecho = null;
                while (p.izquierdo != null) {
                    p = p.izquierdo;
                }
                p.izquierdo = raiz.izquierdo;
                return p2;
            }
        }
        if (raiz.dato < key) {
            raiz.derecho = dtree(raiz.derecho, key);
        } else
            raiz.izquierdo = dtree(raiz.izquierdo, key);
        return raiz;
    }
}
