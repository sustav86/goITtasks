package sustavov.goit.module5.task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class QuickSortAlgorithmTest {

    @Test
    public void testFirstElement() throws Exception {
        int[] array = {5, 78, -5, 4};
        QuickSortAlgorithm.sort(array);

        Assert.assertTrue(-5 == array[0]);
    }

    @Test
    public void testLastElement() throws Exception {
        int[] array = {5, 78, -5, 4};
        QuickSortAlgorithm.sort(array);

        Assert.assertTrue(78 == array[array.length-1]);
    }

    @Test
    public void testPositive() throws Exception {
        int[] array = {4, 2, 6, 4, 7, 45, 78, 6};
        int[] expected = {2,4,4,6,6,7,45,78};
        QuickSortAlgorithm.sort(array);
        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testNegative() throws Exception {
        int[] array = {-4, -2, -6, -4, -7};
        int[] expected = {-7, -6, -4, -4, -2};
        QuickSortAlgorithm.sort(array);
        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testNegativeAndPositive() throws Exception {
        int[] array = {-4, -2, -6, 4, -7, 0};
        int[] expected = {-7, -6, -4, -2, 0, 4};
        QuickSortAlgorithm.sort(array);
        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] array = {1};
        int[] expected = {1};
        QuickSortAlgorithm.sort(array);
        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] array = {-4};
        int[] expected = {-4};
        QuickSortAlgorithm.sort(array);
        Assert.assertArrayEquals(array, expected);
    }

}