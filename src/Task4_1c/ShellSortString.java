package Task4_1c;

import static java.lang.System.out;

public class ShellSortString {
    public static void main(String[] args) {
        String array[] = {"Mauro", "Leonardo", "Alvaro", "Matias", "Victor", "Noelia", "Natalia", "Silvana", "Adrian", "German"};

        out.print("Non-Sorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }

        shellSort(array);

        out.print("\nSorted Alphabetically: ");
        for (String string : array) {
            out.printf("%s ", string);
        }
    }

    private static void shellSort(String array[]) {
        String temp;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j].compareTo(array[j + gap]) > 0; j -= gap) {
                    temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
            }
        }
    }
}
