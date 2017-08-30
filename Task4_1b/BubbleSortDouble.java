package Task4_1b;

import static java.lang.System.*;

public class BubbleSortDouble {
    public static void main(String[] args) {
        double array[] = {8.1, 5.6, 9.4, 2.3, -42.3, 6.2, 3.5, 37.2, 2.9, 6.3, 4.1, -89.0, 8.7, 10.5, 12.9, 68.4, 45.1, 19.8, 13.7, -8.3, 5.1, 27.0, 1.2, 26.3, 31.7, 16.4, 2.2, 9.9, 11.0, 21.3, 3.130, -3.4};

        out.print("Non-Sorted List: ");
        for (double real : array) {
            out.printf("%.2f ", real);
        }

        bubbleSort(array);

        out.print("\nSorted List: ");
        for (double real : array) {
            out.printf("%.2f ", real);
        }
    }

    private static void bubbleSort(double array[]) {
        int n;
        double temp;

        for (int i = 1; i < array.length; i++) {
            n = i;

            while (n > 0 && array[n - 1] > array[n]) {
                temp = array[n];
                array[n] = array[n - 1];
                array[n - 1] = temp;
                n--;
            }
        }
    }
}
