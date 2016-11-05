package sustavov.goit.practice.task1_5;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class BypassingSnakeMatrix {
    public static int[] getOneDimensionalArray(int[][] array) throws NullPointerException, ArrayIndexOutOfBoundsException{
        int[] resultArray = new int[array.length * array[0].length];
        int k = 0;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                resultArray[k++] = array[i][j];
            }
        }
        return resultArray;
    }
}
