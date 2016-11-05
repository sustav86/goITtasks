package sustavov.goit.practice.task1_6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
//        int[][] array = new int[random.nextInt(20)][random.nextInt(20)];
        int[][] array = new int[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

//        array = new int[0][1];
//        System.out.println(array.length);
//        System.out.println(array[0].length);
        print(array);
        System.out.println(Arrays.toString(BypassingSpiralMatrix.getOneDimensionalArray(array)));
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
