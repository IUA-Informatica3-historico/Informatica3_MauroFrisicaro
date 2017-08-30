package Task4_1c;

import static java.lang.System.out;

public class BubbleSortString {
    public static void main(String[] args) {
        String array[] = {"Mauro", "Leonardo", "Alvaro", "Matias", "Victor", "Noelia", "Natalia", "Silvana", "Adrian", "German"};

        out.print("Non-Sorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }

        bubbleSort(array);

        out.print("\nSorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }
    }

    private static void bubbleSort(String array[]) {
        int n;
        String temp;

        for (int i = 1; i < array.length; i++) {
            n = i;

            while (n > 0 && array[n - 1].compareTo(array[n]) > 0) {
                temp = array[n];
                array[n] = array[n - 1];
                array[n - 1] = temp;
                n--;
            }
        }
    }
}
