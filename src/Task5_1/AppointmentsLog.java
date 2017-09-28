package Task5_1;

import java.util.Scanner;

public class AppointmentsLog {
    private static int size = 0, front = 0, back = -1;
    private static String citas[] = new String[5];

    public static void main(String[] args) {
        int op;
        String x;
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);

        System.out.println("APUNTADOR DE CITAS\n");

        do {
            System.out.print("1 - Agregar cita\n2 - Quitar cita\n3 - Ver citas\n4 - Vaciar apuntador\n5 - Salir");

            System.out.print("\n\nElija una opcion: ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    if (size == citas.length) {
                        System.out.println("\nEl apuntador esta lleno\n");
                        break;
                    }

                    System.out.print("\nNueva cita: ");
                    x = entrada.next();
                    agregar(x);
                    System.out.println();
                    break;

                case 2:
                    quitar();
                    break;

                case 3:
                    if (esVacia()) {
                        System.out.println("\nEl apuntador est� vac�o\n");
                        break;
                    }

                    int j = 0, k = 1;
                    System.out.println();

                    for (int i = front; j < size; i = incremento(i)) {
                        System.out.printf("(%d) %s\n", k, citas[i]);
                        j++;
                        k++;
                    }

                    System.out.println();
                    break;

                case 4:
                    vaciar();
                    System.out.println("\nSe ha vaciado el apuntador\n");
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.print("\nOpcion no valida\n\n");
            }
        }
        while (op != 5);
    }

    public static void agregar(String x) {
        back = incremento(back);
        citas[back] = x;
        size++;
    }

    public static void quitar() {
        if (esVacia()) {
            System.out.println("\nEl apuntador esta vacio\n");
        } else {
            front = incremento(front);
            size--;
            System.out.println("\nSe ha quitado la primera cita\n");
        }
    }

    private static int incremento(int x) {
        if (++x == citas.length) {
            x = 0;
        }

        return x;
    }

    public static boolean esVacia() {
        return size == 0;
    }

    public static void vaciar() {
        size = 0;
        front = 0;
        back = -1;
    }
}
