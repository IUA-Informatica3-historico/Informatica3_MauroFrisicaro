package Task4_1b;

import static java.lang.System.out;

public class QuickSortDouble {
    public static void main(String[] args) {
        double array[] = {8.1, 5.6, 9.4, 2.3, -42.3, 6.2, 3.5, 37.2, 2.9, 6.3, 4.1, -89.0, 8.7, 10.5, 12.9, 68.4, 45.1, 19.8, 13.7, -8.3, 5.1, 27.0, 1.2, 26.3, 31.7, 16.4, 2.2, 9.9, 11.0, 21.3, 3.130, -3.4};

        out.print("Non-Sorted List: ");
        for (double real : array) {
            out.printf("%.2f ", real);
        }

        quickSort(array, 0, array.length - 1);

        out.print("\nSorted List: ");
        for (double real : array) {
            out.printf("%.2f ", real);
        }
    }

    private static void quickSort(double array[], int left, int right) {
        int i = left, j = right;
        double temp;

        do {
            while (array[j] > array[i] && j > i) {
                j--;
            }

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }

            while (array[i] < array[j] && i < j) {
                i++;
            }

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j--;
            }
        }
        while (i < j);

        if (left < j) {
            quickSort(array, left, j - 1);
        }

        if (i < right) {
            quickSort(array, i + 1, right);
        }
    }
}
