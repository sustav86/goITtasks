package sustavov.goit.module4.task3;

/**
 * Created by SUSTAVOV on 31.05.2016.
 * * The DistanceBetweenTwoPoints class is counting the distance among two points
 * @author Sustavov
 * @version 1.0
 *
 */
public class DistanceBetweenTwoPoints {

    /**
     *
     * @param x1 coordinate of the first point
     * @param y1 coordinate of the first point
     * @param x2 coordinate of the second point
     * @param y2 coordinate of the second point
     * @return the <tt>distance</> among two points
     */
    public static double getDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
