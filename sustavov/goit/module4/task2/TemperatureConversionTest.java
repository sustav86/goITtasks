package sustavov.goit.module4.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class TemperatureConversionTest {

    @Test
    public void testCelsius() throws Exception {
        double a = 5;

        final double result = TemperatureConversion.getCelsius(a);

        Assert.assertTrue((a - 32) * 5 / 9 == result);

    }

    @Test
    public void testFahrenheit() throws Exception {
        double a = 5;

        final double result = TemperatureConversion.getFahrenheit(a);

        Assert.assertTrue(a * 9 / 5 + 32 == result);

    }

}