package me.levy;

import java.util.ArrayList;
import java.util.Collections;

public class CoronaDeviceSimmulator {
    // max distance of devices
    private double minDistance;

    // list of all devices available
    private ArrayList<CoronaDistanceDetectionDevice> allDevices;

    // getting access to algorithems
    CoronaSoftwareAlgorithems algorithems = new CoronaSoftwareAlgorithems();

    /**
     * Constructor
     * @param minDist
     */
    public CoronaDeviceSimmulator(double minDist, ArrayList<CoronaDistanceDetectionDevice> listOfDevices) {
        // sets max distance
        minDistance = minDist;
        // creates devices list
        allDevices = new ArrayList<>();
        // adds devices to list
        allDevices.addAll(listOfDevices);
    }

    /**
     * takes in an array of devices
     * - flips the list and creates a dulicate reverse array list
     * - compares both lists wihtout repeating
     * - compares distance
     * - if < mimDistance
     *      - add to counter
     *      - add encountered ID's to personal list
     */
    public void simulation() {
        CoronaSoftwareDataSheet info;

        ArrayList<CoronaDistanceDetectionDevice> devicesReversed;
        devicesReversed = new ArrayList<>();

        // creating a duplicate list of devices list
        devicesReversed.addAll(allDevices);
        // reversing the duplicate list
        Collections.reverse(devicesReversed);

        String dataSheet;

        // COMPARING ALGORITHEM
        for(CoronaDistanceDetectionDevice i : allDevices) {
            devicesReversed.remove(devicesReversed.size() - 1);
            for(CoronaDistanceDetectionDevice j : devicesReversed) {

                // compare i and j

                double distance = algorithems.distanceBetweenIds(i.getX(), j.getX(), i.getY(), j.getY());

                if(distance < minDistance) {
                    // increase encounter counter
                    i.addToEncounters(1);
                    j.addToEncounters(1);

                    // add encountered id to personal encountered array list
                    i.addToEncounteredList(j);
                    j.addToEncounteredList(i);
                }

//                System.out.println("\nID #" + i.getID() + " and ID #" + j.getID() + ": " + distance + "m");

            }

            // CREATING DATA SHEET
            // creating an instance of teh data sheet class
            info = new CoronaSoftwareDataSheet(i);

            dataSheet = info.getInfoSheet();
            //PRINTING OUT DATA SHEET
            System.out.println(dataSheet);
            System.out.println("\n");
        }
    }
}
