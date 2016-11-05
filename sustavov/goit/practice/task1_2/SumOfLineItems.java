package sustavov.goit.practice.task1_2;

import java.math.BigInteger;

/**
 * Created by SUSTAVOV on 16.07.2016.
 */
public class SumOfLineItems {
    public static BigInteger getSumOfLineItems(String string) {
        if (string == null) {
            return BigInteger.ZERO;
        }

        if (!checkString(string)) {
            throw new NumberFormatException("This array should have only numeric elements");
        }

        char[] charArray = string.toCharArray();
        BigInteger bigInteger = new BigInteger("0");
        for (char character : charArray) {
            bigInteger = bigInteger.add(BigInteger.valueOf(Character.getNumericValue(character)));
        }

        return bigInteger;

    }

    private static boolean checkString(String string) {
        return string.matches("^-?\\d+$");
    }

}
