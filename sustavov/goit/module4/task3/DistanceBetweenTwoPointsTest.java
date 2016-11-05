package sustavov.goit.module4.task3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class DistanceBetweenTwoPointsTest {
    @Test
    public void testDistanceBetweenTwoPoints() throws Exception {
        double x1 = 2.5;
        double y1 = 5.78;
        double x2 = 4.7;
        double y2 = 7.93;

        double result = DistanceBetweenTwoPoints.getDistanceBetweenTwoPoints(x1, y1, x2, y2);

        Assert.assertTrue(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) == result);



    }

}