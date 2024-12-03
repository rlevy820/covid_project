package me.levy;

import java.util.ArrayList;

public class CoronaSoftwareDataSheet{
    private CoronaDistanceDetectionDevice device;
    // arrayLsit of encountered ID #'s, not objects
    ArrayList<Integer> getEncounterID;

    public CoronaSoftwareDataSheet(CoronaDistanceDetectionDevice device) {
        this.device = device;
        getEncounterID = new ArrayList<>();
    }

    public String getInfoSheet() {
        String info = "";

        String s1 = "\n------INFO SHEET FOR DEVICE WITH ID #" + device.getID() + "-----";
        String s2 = "\n" + device.getEncountersNumber() + " people encountered with";

        // getting just ID #'s, not whole object

        for(CoronaDistanceDetectionDevice c : device.getEncounteredDevices()) { // for each device in the persons ecountered device list
            // add the ID's to the array List of Intergers
            getEncounterID.add(c.getID());
        }

        String s3 = "\nEncountered with the following other devices (ID's): " + getEncounterID;

        info = s1 + s2 + s3;

        return info;
    }
}
