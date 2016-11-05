package sustavov.goit.practice.task1_4;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class SearchMaximalElement {
    public static int getMaximalElement(int[] array) {
        for (int i = array.length-1; i > 0; i--) {

            int index = i;
            while (index != 0)
            {
                if (array[index / 2] < array[index])
                {
                    int buff = array[index / 2];
                    array[index / 2] = array[index];
                    array[index] = buff;
                }
                index = index /2;
            }

        }

        return array[0];
    }

}
