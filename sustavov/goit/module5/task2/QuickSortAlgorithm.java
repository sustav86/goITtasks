package sustavov.goit.module5.task2;

/**
 * The class QuickSortAlgorithm get sorted the array by Quick sort algorithm
 * Created by ukr-sustavov on 02.06.2016.
 * @author SUSTAVOV
 * @version 1.0
 */
public class QuickSortAlgorithm {

    public static void sort(int[] array) {

        if (array == null || array.length == 0) {
            //same stuff as for MinMaxFounder
            throw new IllegalArgumentException("You array is null or contains no data");
        }
        int start = 0;
        int end = array.length - 1;
        toSort(array, start, end);
    }

    private static void toSort(int[] array, int start, int end) {

        if (start >= end)
            return;
        int i = start, j = end;
        int middle = i - (i - j) / 2;
        while (i < j) {
            while (i < middle && (array[i] <= array[middle])) {
                i++;
            }
            while (j > middle && (array[middle] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == middle)
                    middle = j;
                else if (j == middle)
                    middle = i;
            }
        }
        toSort(array, start, middle);
        toSort(array, middle+1, end);
    }
}

