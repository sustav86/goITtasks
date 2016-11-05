package sustavov.goit.module4.task2;

/**
 * Created by SUSTAVOV on 31.05.2016.
 * * The TemperatureConversion class is converts temperature from Celsius to Fahrenheit and vice versa
 * @author Sustavov
 * @version 1.0
 *
 */
public class TemperatureConversion {

    /**
     *
     * @param fahrenheit the temperature in Fahrenheit
     * @return the <>temperature</> in Celsius
     */
    public static double getCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     *
     * @param celsius the temperature in Celsius
     * @return the <>temperature</> in Fahrenheit
     */
    public static double getFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
