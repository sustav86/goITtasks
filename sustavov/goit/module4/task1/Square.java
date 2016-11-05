package sustavov.goit.module4.task1;


/**
 * Created by SUSTAVOV on 30.05.2016.
 * The Square class is calculate square of triangles, rectangles and circles
 * @author Sustavov
 * @version 1.0
 *
 */
public class Square {

    /**
     *
     * @param sideA the base of triangle
     * @param height the perpendicular to the direction of sideA
     * @return the <tt>square</> of triangle if sideA and sideB > 0 else <tt>-1</>
     */
    public double triangleSquare(double sideA, double height) {
        if (checkSides(sideA, height)) {
            return 0.5 * sideA * height;
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param cornerAmongThem the corner among sideA and sideB
     * @return the <tt>square</> of triangle if sideA, sideB > 0 and cornerAmongThem <= 180 else <tt>-1</>
     */
    public double triangleSquare(double sideA, double sideB, double cornerAmongThem) {
        if (checkCorner(cornerAmongThem) && checkSides(sideA, sideB)) {
            return 0.5 * sideA * sideB * Math.sin(cornerAmongThem);
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param sideC the third side of triangle
     * @return the <tt>square</>of triangle if sideA, sideB and sideC are make the triangle else <tt>-1</>
     */
    public double triangleSquare(float sideA, float sideB, float sideC) {
        if (checkTriangleSides(sideA, sideB, sideC)) {
            float perimeter = getPerimeter(sideA, sideB, sideC);
            return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * perimeter - sideC);
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param sideC the third side of triangle
     * @param radius the radius of the inscribed circle
     * @return the <tt>square</>of triangle if sideA, sideB, sideC are make the triangle and radius > 0 else <tt>-1</>
     */
    public double triangleSquare(float sideA, float sideB, float sideC, float radius) {
        if (checkTriangleSides(sideA, sideB, sideC) && checkRadius(radius)) {
            float perimeter = getPerimeter(sideA, sideB, sideC);
            return radius * perimeter;

        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param sideC the third side of triangle
     * @param radius the radius of the circle
     * @return the <tt>square</>of triangle if sideA, sideB, sideC are make the triangle and radius > 0 else <tt>-1</>
     */
    public double triangleSquare(float sideA, float sideB, float sideC, double radius) {
        if (checkTriangleSides(sideA, sideB, sideC) && checkRadius(radius)) {
            return sideA * sideB * sideC / 4 * radius;
        }
        return -1;
    }

    /**
     *
     * @param radius the radius of the inscribed circle
     * @param perimeter the sum of all side in triangle
     * @return the <tt>square</>of triangle if radius and perimeter > 0 else <tt>-1</>
     */
    public float triangleSquare(float radius, float perimeter) {
        if (checkSides(radius, perimeter)) {
            return radius * perimeter;
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param perimeter the sum of all side in triangle
     * @return the <tt>square</>of triangle if sideA, sideB and perimeter > 0 else <tt>-1</>
     */
    public double triangleSquare(float sideA, float sideB, double perimeter) {
        if (checkSides(sideA, sideB, perimeter)) {
            return (perimeter - sideA) * (perimeter - sideB);
        }
        return -1;
    }

    /**
     *
     * @param sideB the first side of triangle
     * @param alpha
     * @return the <tt>square</> of triangle if sideB > 0 and alpha < 180 else <tt>-1</>
     */
    public double triangleSquare(double sideB, float alpha) {
        if (checkCorner(alpha) && checkSides(sideB)) {
            return Math.pow(sideB, 2) / 4 * Math.tan(alpha / 4);
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @return the <tt>square</> of triangle if sideA > 0 <tt>-1</>
     */
    public double triangleSquare(double sideA) {
        if (checkSides(sideA)) {
            return Math.sqrt(3) * Math.pow(sideA, 2) / 4;
        }
        return -1;
    }

    /**
     *
     * @param radius the radius of the circle
     * @return the <tt>square</> of triangle if radius > 0 <tt>-1</>
     */
    public double triangleSquare(float radius) {
        if (checkRadius(radius)) {
            return 3 * Math.sqrt(3) * Math.pow(radius, 2);
        }
        return -1;
    }

    /**
     *
     * @param height the equilateral triangle height
     * @return the <tt>square</> of triangle if height > 0 <tt>-1</>
     */
    public double triangleSquare(Double height) {
        if (checkRadius(height)) {
            return Math.pow(height, 2) / Math.sqrt(3);
        }
        return -1;
    }

    /**
     *
     * @param hypotenuseD the side of the tangent to the circle
     * @param hypotenuseE the side of the tangent to the circle
     * @return the <tt>square</> of triangle if hypotenuseD and hypotenuseE > 0 <tt>-1</>
     */
    public double triangleSquare(Double hypotenuseD, Double hypotenuseE) {
        if (checkSides(hypotenuseD, hypotenuseE)) {
            return hypotenuseD * hypotenuseE;
        }
        return -1;
    }

    /**
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @return the <tt>square</> of triangle if sideA and sideB > 0 else <tt>-1</>
     */
    public double rectangleSquare(double sideA, double sideB) {
        if (checkSides(sideA, sideB)) {
            return sideA * sideB;
        }
        return -1;
    }

    /**
     *
     * @param radius the radius of the circle
     * @return the <tt>square</> of circle if radius > 0 <tt>-1</>
     */
    public double circleSquare(Double radius) {
        if (checkRadius(radius)) {
            return Math.PI * Math.pow(radius, 2);
        }
        return -1;
    }

    /**
     *
     * @param diameter the diameter of the circle
     * @return the <tt>square</> of circle if diameter > 0 <tt>-1</>
     */
    public double circleSquare(float diameter) {
        if (checkRadius(diameter)) {
            return Math.PI / 4 * Math.pow(diameter, 2);
        }
        return -1;
    }

    /*
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param sideC the third side of triangle
     * @return the <tt>perimeter</> of triangle
     * @throws IllegalArgumentException
     */
    private float getPerimeter(float sideA, float sideB, float sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("value of 'sideA' or 'sideB' or 'sideC' is negative or equal zero: sideA="+sideA+", sideB="+sideB+", sideC="+sideC);
        }
        return (sideA + sideB + sideC) / 2;
    }

    /*
     *
     * @param corner the corner among two triangle sides
     * @return <tt>true</> if corner > 0 and corner < 180 else <tt>false</>
     * @throws IllegalArgumentException
     */
    public boolean checkCorner(double corner) {
        if (corner > 180 || corner < 0) {
            throw new IllegalArgumentException("value of 'corner' is negative or more than 180 degree: corner="+corner);
        }
        return true;
    }

    /*
     *
     * @param sideA the first side of triangle
     * @param sideB the second side of triangle
     * @param sideC the third side of triangle
     * @return <tt>true</> if sideA, sideB, sideC are make the triangle else <tt>false</>
     * @throws IllegalArgumentException
     */
    private boolean checkTriangleSides(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideC + sideA <= sideB) {
            throw new IllegalArgumentException("value of 'sideA + sideB <= sideC' or 'sideB + sideC <= sideA' or 'sideC + sideA <= sideB' : sideA="+sideA+", sideB="+sideB+", sideC="+sideC);
        }
        return true;
    }

    /*
     *
     * @param sideA the first side
     * @param sideB the second side
     * @return <tt>true</> if sideA and sideB > 0 else <tt>false</>
     * @throws IllegalArgumentException
     */
    private boolean checkSides(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("value of 'sideA' or 'sideB' is negative or less zero: sideA="+sideA+", sideB="+sideB);
        }
        return true;
    }

    /*
     *
     * @param sideA the first side
     * @param sideB the second side
     * @param thirdParam the third parameter
     * @return <tt>true</> if sideA, sideB and parameter > 0 else <tt>false</>
     * @throws IllegalArgumentException
     */
    private boolean checkSides(double sideA, double sideB, double thirdParam) {
        if (sideA <= 0 || sideB <= 0 || thirdParam <= 0) {
            throw new IllegalArgumentException("value of 'sideA' or 'thirdParam' is negative or equal zero: sideA="+sideA+", sideB="+sideB+", thirdParam="+thirdParam);
        }
        return true;
    }

    /*
     *
     * @param parameter
     * @return <tt>true</> if parameter > 0 else <tt>false</>
     * @throws IllegalArgumentException
     */
    private boolean checkSides(double parameter) {
        if (parameter <= 0) {
            throw new IllegalArgumentException("value of 'parameter' is negative or equal zero : parameter="+parameter);
        }
        return true;
    }

    /*
     *
     * @param radius the radius of circle
     * @return <tt>true</> if radius > 0 else <tt>false</>
     * @throws IllegalArgumentException
     */
    private boolean checkRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("value of 'radius' is negative or equal zero : radius="+radius);
        }
        return true;
    }

}
