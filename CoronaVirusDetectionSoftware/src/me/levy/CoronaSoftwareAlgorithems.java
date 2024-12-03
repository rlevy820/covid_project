package me.levy;

import java.text.DecimalFormat;

/**
 * Corona Software Algorithems
 */
public class CoronaSoftwareAlgorithems {

    /**
     * Calculate distance between two id's
     * x - longitude
     * y - latitude
     *
     * Using distance formula
     * d = Square Root of ((x2 - x1)^2 + (y2 - y1)^2)
     *
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @return
     */
    public double distanceBetweenIds(double x1, double x2, double y1, double y2) {
        double distance;

        distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));

        return distance;
    }
}
