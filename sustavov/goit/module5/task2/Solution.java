package sustavov.goit.module5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by ukr-sustavov on 02.06.2016.
 */
public class Solution
{
    public static void main(String[] args)
    {
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrayCount;
        System.out.println("Enter the number of array elements :");

        try
        {
            String userInput = reader.readLine();
            arrayCount = Integer.parseInt(userInput);
            if (arrayCount < 0) {
                System.out.println("Array count must be more 0");
                arrayCount = 0;
            }
        }catch (NumberFormatException ex) {
            System.out.println("Please. Enter the numeric");
            arrayCount = 0;
        }catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
            arrayCount = 0;
        }

        int[] array = new int[arrayCount];
        for (int i = 0; i < arrayCount; i++)
        {
            array[i] = random.nextInt(1000);
        }

        printArray(array, "### main array ###");
        QuickSortAlgorithm.sort(array);
        printArray(array, "QuickSort");

    }

    /**
     *
     * @param array of numbers
     * @param text print what we display to user
     */
    public static void printArray(int[] array, String text) {

        System.out.println(text);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
