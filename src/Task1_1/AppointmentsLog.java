/*  Mauro Frisicaro mfrisicaro220@alumnos.iua.edu.ar
    1. Implemente un apuntador de citas usando el concepto de cola circular
    implementada mediante el uso de un arreglo. */

package Task1_1;

import java.util.Scanner;

public class AppointmentsLog {
    public static void main(String[] args) {
        Queue dates = new Queue();

        int op;
        String text;
        Scanner input = new Scanner(System.in);

        System.out.print("Appointments Log\n\n");

        do {
            System.out.print("1 - Add Appointment\n2 - Remove First Appointment\n" +
                    "3 - List Appointments\n4 - Empty Log\n5 - Exit\n\nOption: ");
            op = input.nextInt();

            switch (op) {
                case 1: // Add Appointment
                    if (dates.fullLogCheck()) {
                        System.out.println("\nThe log is full!\n");
                        break;
                    }

                    System.out.print("\nNew Appointment: ");
                    text = input.next();
                    dates.push(text);
                    System.out.println();
                    break;

                case 2: // Remove Appointment
                    if (dates.emptyLogCheck()) {
                        System.out.println("\nThe log is empty.\n");
                    } else {
                        System.out.println(dates.top());
                        dates.pop();
                        System.out.println("\nAppointment removed.\n");
                    }
                    break;

                case 3: // List Appointments
                    if (dates.emptyLogCheck()) {
                        System.out.println("\nThe log is empty.\n");
                        break;
                    }

                    dates.showLog();
                    break;

                case 4: // Empty Log
                    dates.emptyLog();
                    System.out.println("\nThe log now is empty.\n");
                    break;

                case 5: // Exit
                    System.exit(0);

                default:
                    System.out.print("\nInvalid Option\n\n");
            }
        }
        while (op != 5);
    }
}
