package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.pow(value,0.5);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        return Arrays
                .stream(value)
                .map(x -> squareRoot(x))
                .toArray(Double[]::new);
    }

    public static Double[] squares(Double... values) {
        return Arrays
                .stream(values)
                .map(x -> square(x))
                .toArray(Double[]::new);
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 -  value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
