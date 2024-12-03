package me.levy;

import java.util.ArrayList;

/**
 * @author Ryan Levy
 * @version April 18, 2020 (4/18/20)
 *
 * Corona Programming Idea
 *
 * Create an object that has behaviors
 * - object is a one device
 * - each object has an  {ID, a counter},
 * {array of  encounteredID's, distanceToDevice (2D array coordinates) }
 *
 *
 * DISTANCE
 * compares coordinates using distance formula
 * if less than max amount
 *
 * DATA
 * If ID #1 has corona, get ID #1's encounteredArrayList<>();.
 * Go down the list and use recursion to create a data sheet of who was infected.
 *
 * COORDINATES
 * (+) for North and East
 * (-) for South and West
 * Latitude (-90 to 90)
 * Longitude (-180 to 180)
 */
public class CoronaDistanceDetectionDevice {
    // private instance variables
    private int ID;
    private int encountersNumber;
    private double x, y;
    private ArrayList<CoronaDistanceDetectionDevice> encounteredDevices;

    /**
     * Constructor
     *
     * (+) for North and East
     * (-) for South and West
     * Latitude (-90 to 90)
     * Longitude (-180 to 180)
     *
     * @param id
     */
    public CoronaDistanceDetectionDevice(int id, double longitude, double latitude) {
        ID = id;
        encountersNumber = 0;
        x = longitude;
        y = latitude;
        encounteredDevices = new ArrayList<>();
    }

    /**
     * Converting longitude and latitude degrees units to kilometers
     * @param degrees
     * @return
     */
    public double convertDegreesCoordinatesToKilometers(double degrees) {
        return degrees * (10000 / 90);
    }

    public void addToEncounteredList(CoronaDistanceDetectionDevice device) {
        encounteredDevices.add(device);
    }

    // GETTERS AND SETTERS


    public int getID() {
        return ID;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getEncountersNumber() {
        return encountersNumber;
    }

    public void addToEncounters(int add) {
        encountersNumber += add;
    }

    public ArrayList<CoronaDistanceDetectionDevice> getEncounteredDevices() {
        return encounteredDevices;
    }
}
