/*  2. Utilice los métodos de ordenación de inserción, Shellsort y quicksort para
    ordenar el archivo es.txt y evaluando el tiempo que demora cada algoritmo. */
package Task4_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortTXT {
    public static void main(String[] args) {
        System.out.print("Started Running\n..............\n\n");

        // Making the array
        String arrayS[] = new String[2014322]; // 2014322 Elements to be sorted
        String arrayB[] = new String[2014322]; // 2014322 Elements to be sorted
        String arrayQ[] = new String[2014322]; // 2014322 Elements to be sorted

        try {
            FileReader reader = new FileReader("src\\Task4_2\\es.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            for (int i = 0; (line = bufferedReader.readLine()) != null; ++i) {
                arrayS[i] = line;
                arrayQ[i] = line;
                arrayB[i] = line;
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sorting
        long tNow, tBS, tSS, tQS;

        tNow = System.nanoTime();
        bubbleSort(arrayB);
        tBS = System.nanoTime() - tNow;

        tNow = System.nanoTime();
        shellSort(arrayS);
        tSS = System.nanoTime() - tNow;

        tNow = System.nanoTime();
        quickSort(arrayQ, 0, arrayQ.length - 1);
        tQS = System.nanoTime() - tNow;

        double secs = 1000000000.0;
        System.out.print("BubbleSort took " + tBS + " nanoseconds.\nShellSort took " + tSS + " nanoseconds.\nQuickSort took " + tQS + " nanoseconds.\n\n");
        System.out.print("BubbleSort took " + tBS / secs + " seconds.\nShellSort took " + tSS / secs + " seconds.\nQuickSort took " + tQS / secs + " seconds.\n");
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
