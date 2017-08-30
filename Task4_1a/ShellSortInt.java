package Task4_1a;

import static java.lang.System.*;

public class ShellSortInt {
    public static void main(String[] args) {
        int array[] = {84, 90, -38, 21, 98, 97, 26, 92, 56, -75, 54, 71, 82, 63, 58, 60, 18, 57, 12, 37, 20, 31, 99, 48, 66, -47, 23, 89, 74, 22, 13, 44, 27, 11, 1, 87, 82, 10, 79, 0, 32, -49, 69, 68, 81, 6, 61, 64};

        out.print("Non-Sorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }

        shellSort(array);

        out.print("\nSorted List: ");
        for (int integer : array) {
            out.printf("%d ", integer);
        }
    }

    private static void shellSort(int array[]) {
        int temp;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {
                    temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
            }
        }
    }
}

