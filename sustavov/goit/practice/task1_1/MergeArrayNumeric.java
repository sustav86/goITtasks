package sustavov.goit.practice.task1_1;

import java.math.BigDecimal;

/**
 * Created by SUSTAVOV on 16.07.2016.
 */
public class MergeArrayNumeric {

    public static BigDecimal getNumberFromArray(String[] array) {
        if (array == null) {
            return BigDecimal.ZERO;
        }
        String stringBuffer = String.join("", array);
        if (!checkString(stringBuffer)) {
            throw new NumberFormatException("This array should have only numeric elements");
        }
        return new BigDecimal(stringBuffer);
    }

    private static boolean checkString(String string) {
        return string.matches("^-?\\d+$");
    }
}
