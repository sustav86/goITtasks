package sustavov.goit.module5.task1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class MinMaxFounderTest {

    private static MinMaxFounder minMaxFounder;

    @BeforeClass
    public static void setUp() throws Exception {
        minMaxFounder = new MinMaxFounder();
    }

    @Test
    public void testMinArray() throws Exception
    {
        int[] array = {-5, 0, 7, 81};
        minMaxFounder.minMaxElement(array);

        Assert.assertTrue(-5 == minMaxFounder.getMin());

    }

    @Test
    public void testMaxArray() throws Exception {
        int[] array = {-5, 0, 7, 81};
        minMaxFounder.minMaxElement(array);

        Assert.assertTrue(81 == minMaxFounder.getMax());

    }

    @Test
    public void testSinglePositive() throws Exception {
        int[] array = {5};
        minMaxFounder.minMaxElement(array);
        int[] expected = {5};

        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testSingleNegative() throws Exception {
        int[] array = {-9};
        minMaxFounder.minMaxElement(array);
        int[] expected = {-9};

        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testPositive() throws Exception {
        int[] array = {5, 0, 4, 9, 8};
        minMaxFounder.minMaxElement(array);
        int[] expected = {5, 0, 4, 9, 8};

        Assert.assertArrayEquals(array, expected);
    }

    @Test
    public void testNegative() throws Exception {
        int[] array = {-9, -10, -2, -98};
        minMaxFounder.minMaxElement(array);
        int[] expected = {-9, -10, -2, -98};

        Assert.assertArrayEquals(array, expected);
    }

}