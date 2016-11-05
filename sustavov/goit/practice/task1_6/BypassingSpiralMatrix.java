package sustavov.goit.practice.task1_6;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class BypassingSpiralMatrix {

    public static int[] getOneDimensionalArray(int[][] array) {
        if (array == null) {
            throw new NullPointerException("Array should be not null");
        }else if (array.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array should be not empty");
        }
        int[] resultArray = new int[array.length * array[0].length];
        int borderBottomX = 0;
        int borderTopX = array.length-1;
        int borderLeftY = 0;
        int borderRightY = array[0].length-1;
        int t = 0;
        boolean forwardX = false;
        boolean forwardY = false;
        boolean backX = false;

        while (t < array.length * array[0].length) {
            //Forward by X
            for (int i = borderLeftY; i <= borderRightY; i++) {
                resultArray[t] = array[borderLeftY][i];
                t++;
                forwardX = true;
            }
            borderBottomX++;

            // Forward by Y
            for (int i = borderBottomX; i <= borderTopX && forwardX; i++) {
                resultArray[t] = array[i][borderRightY];
                t++;
                forwardY = true;
            }
            borderRightY--;

            //Back by X
            for (int i = borderRightY; i >= borderLeftY && forwardY; i--) {
                resultArray[t] = array[borderTopX][i];
                t++;
                backX = true;

            }
            borderTopX--;

            // Back bu Y
            for (int i = borderTopX; i >= borderBottomX && backX; i--) {
                resultArray[t] = array[i][borderLeftY];
                t++;
            }
            borderLeftY++;

            forwardX = false;
            forwardY = false;
            backX = false;
        }

        return resultArray;
    }

}
