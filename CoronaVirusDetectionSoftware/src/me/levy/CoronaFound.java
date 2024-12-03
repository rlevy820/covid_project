package me.levy;

import java.util.ArrayList;

/**
 * If an ID has corona, it will check which othe ID's it has ecountered with
 * Then, it will check who thhose ID's have encoutered with
 * This will use recursion to repeat unitil there is no one left
 */
public class CoronaFound {
    private ArrayList<CoronaDistanceDetectionDevice> directlyExposed;
    private ArrayList<CoronaDistanceDetectionDevice> indirectlyExposed;
    private ArrayList<CoronaDistanceDetectionDevice> stopArray;
    private ArrayList<CoronaDistanceDetectionDevice> checkArray;
    // array List of objects
    private ArrayList<CoronaDistanceDetectionDevice> allDevices;
    private CoronaDistanceDetectionDevice infected;

    public CoronaFound(ArrayList allDevices, CoronaDistanceDetectionDevice infected) {
        this.allDevices = allDevices;
        this.infected = infected;
        directlyExposed = new ArrayList<>();
        indirectlyExposed = new ArrayList<>();
        stopArray = new ArrayList<>();
        checkArray = new ArrayList<>();

        // GETTING STOP AND CHECK

        // adding direcly exposed to array
        directlyExposed.addAll(infected.getEncounteredDevices());

        // adding all values (ID and level array) to stopChecker array
        stopArray.add(infected);
        stopArray.addAll(directlyExposed);
    }

    public String whoIsInfected() {
        return "ID #" + infected.getID() + "has the Corona Virus";
    }

    /**
     * Will go down the list and it will compare the stop and check arrays
     * if the same, STOP
     */
    public void stopAndCheck(ArrayList<CoronaDistanceDetectionDevice> level) {
        // one to one to one exception
        if(level.size() == 3) {
            // STOP SEARCHING
        }

        // other options
        //-------------------------------STEPS-------------------------------
        // -------compare level2 (stopArray) to level3(checkArray)-------
        // for both arrays, get rid of duplicated and put in order of increasing ID #
        // is level 2 == level 3 stop
        // else - keep searching and stop after every level


        // LEVEL 2 (STOP)
        ArrayList<CoronaDistanceDetectionDevice> stopArrayDuplicate = new ArrayList<>();
        stopArrayDuplicate = stopArray;

        for(int i = 0; i < stopArray.size(); i++) {
            for(int j = 0; j < stopArrayDuplicate.size(); j++) {
                if(stopArray.get(i) == stopArrayDuplicate.get(j)) {
                    stopArray.remove(i);
                }
            }
        }

    }
}
