package Task4_1a;

import static java.lang.System.out;

public class QuickSortInt {
    public static void main(String[] args) {
        int array[] = {84, 90, -38, 21, 98, 97, 26, 92, 56, -75, 54, 71, 82, 63, 58, 60, 18, 57, 12, 37, 20, 31, 99, 48, 66, -47, 23, 89, 74, 22, 13, 44, 27, 11, 1, 87, 82, 10, 79, 0, 32, -49, 69, 68, 81, 6, 61, 64};

        out.print("Non-Sorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }

        quickSort(array, 0, array.length - 1);

        out.print("\nSorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }
    }

    private static void quickSort(int array[], int left, int right) {
        int i = left, j = right, temp;

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
        } while (i < j);

        if (left < j) {
            quickSort(array, left, j - 1);
        }

        if (i < right) {
            quickSort(array, i + 1, right);
        }
    }
}

