package sustavov.goit.module4.task1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class SquareTest {

    private static Square square;

    @BeforeClass
    public static void setUpSquareClass() throws Exception {
        square = new Square();
    }

    @Test(timeout = 1000)
    public void testTriangleSquareBySideAndHeight() throws Exception {
        //Preconditions
        double a = 5;
        double b = 7;

        //Test steps
        final double result = square.triangleSquare(a, b);

        //Post conditions
        Assert.assertTrue(0.5 * a * b == result);

    }

    @Test
    public void testTriangleSquareBySideHeightAndCornerAmongThem() throws Exception {
        double sideA = 5.8;
        double sideB = 4.7;
        double cornerAmongThem = 3.3;

        double result = square.triangleSquare(sideA, sideB, cornerAmongThem);

        Assert.assertTrue(0.5 * sideA * sideB * Math.sin(cornerAmongThem) == result);

    }

    @Test
    public void testTriangleSquareBySideASideBSAndSideC() throws Exception {
        float sideA = 5.8F;
        float sideB = 4.7F;
        float sideC = 3.3F;
        float perimeter = (sideA + sideB + sideC) / 2;

        double result = square.triangleSquare(sideA, sideB, sideC);

        Assert.assertTrue(Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * perimeter - sideC) == result);

    }

    @Test
    public void testTriangleSquareBySideASideBSideCPerimeterAndRadius() throws Exception {
        float sideA = 5.8F;
        float sideB = 4.7F;
        float sideC = 3.3F;
        float radius = 10F;
        float perimeter = (sideA + sideB + sideC) / 2;

        double result = square.triangleSquare(sideA, sideB, sideC, radius);

        Assert.assertTrue(radius * perimeter == result);

    }

    @Test
    public void testTriangleSquareBySideASideBSideCAndRadius() throws Exception {
        float sideA = 5.8F;
        float sideB = 4.7F;
        float sideC = 3.3F;
        double radius = 10F;

        double result = square.triangleSquare(sideA, sideB, sideC, radius);

        Assert.assertTrue(sideA * sideB * sideC / 4 * radius == result);

    }

    @Test
    public void testTriangleSquareByPerimeterAndRadius() throws Exception {
        float perimeter = 3.3F;
        float radius = 10F;

        float result = square.triangleSquare(radius, perimeter);

        Assert.assertTrue(radius * perimeter == result);

    }

    @Test
    public void testTriangleSquareBySideASideBAndPerimeter() throws Exception {
        float sideA = 5.8F;
        float sideB = 4.7F;
        double perimeter = 10F;

        double result = square.triangleSquare(sideA, sideB, perimeter);

        Assert.assertTrue((perimeter - sideA) * (perimeter - sideB) == result);

    }

    @Test
    public void testTriangleSquareBySideAAndAlpha() throws Exception {
        double sideB = 5.8;
        float alpha = 100F;

        double result = square.triangleSquare(sideB, sideB, alpha);

        Assert.assertTrue(Math.pow(sideB, 2) / 4 * Math.tan(alpha / 4) == result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalCorner() throws Exception {
        double corner = 900;

        square.checkCorner(corner);

    }

}