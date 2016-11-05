package sustavov.goit.practice.task1_4;

import java.util.Random;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(SearchMaximalElement.getMaximalElement(array));

    }


}
