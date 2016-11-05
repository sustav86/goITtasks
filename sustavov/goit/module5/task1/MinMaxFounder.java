package sustavov.goit.module5.task1;

/**
 * Created by ukr-sustavov on 02.06.2016.
 * The MinMaxFounder class get min and max number by usually brute force
 * @author SUSTAVOV
 * @version 1.0
 */
public class MinMaxFounder
{
    private boolean empty;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    /**
     *
     * @param array of numbers
     */
    public void minMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            //Wrong choice of exception. Read description.
            //FYI, Although I said we should not check for "null" all the time, but if it's
            // a public api (which will be used by other programs) we could also check input data
            // for null (since we are not responsible for the "quality" of this data).
            throw new IllegalArgumentException("You array is null or contains no data");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

    }

    /**
     *
     * @return min from array
     */
    public int getMin()
    {
        return min;
    }

    /**
     *
     * @return max from array
     */
    public int getMax()
    {
        return max;
    }

    /**
     *
     * @return true if array is empty, else false
     */
    public boolean isEmpty()
    {
        return empty;
    }
}
