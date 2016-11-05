package sustavov.goit.practice.task1_3;

import java.util.Collection;

/**
 * Created by SUSTAVOV on 17.07.2016.
 */
public class OddNumericSearches {

    public static int getFirstOddNumericIndex(int[] array) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return i;
            }
        }

        return -1;
    }

    public static <T> int getFirstOddNumericIndex(Collection<T> array) {
        if (array == null) {
            return -1;
        }
        Object[] ar = array.toArray();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof Integer) {
                int g = (int) ar[i];
                if (g % 2 != 0) {
                    return i;
                }
            }
        }

        return -1;
    }
}
