package Task4_1c;

import static java.lang.System.out;

public class QuickSortString {
    public static void main(String[] args) {
        String array[] = {"Mauro", "Leonardo", "Alvaro", "Matias", "Victor", "Noelia", "Natalia", "Silvana", "Adrian", "German"};

        out.print("Non-Sorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }

        quickSort(array, 0, array.length - 1);

        out.print("\nSorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }
    }


    private static void quickSort(String array[], int left, int right) {
        int i = left, j = right;
        String temp;

        do {
            while (array[j].compareTo(array[i]) > 0 && j > i) {
                j--;
            }

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }

            while (array[i].compareTo(array[j]) < 0 && i < j) {
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

