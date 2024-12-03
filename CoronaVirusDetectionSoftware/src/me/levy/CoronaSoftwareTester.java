package me.levy;

import java.util.ArrayList;

public class CoronaSoftwareTester {

    public static void main(String[] args) {

        int minDistance = 50;

        // devices array
        ArrayList<CoronaDistanceDetectionDevice> devices = new ArrayList<>();
        // filling array
        for(int i = 1; i < 6; i++) {
            devices.add(new CoronaDistanceDetectionDevice(i, (Math.random() * 181) - 90, (Math.random() * 361) - 180));
        }

        ArrayList<CoronaDistanceDetectionDevice> a = new ArrayList<>();
        a.add(0, new CoronaDistanceDetectionDevice(1, 0,30));
        a.add(1, new CoronaDistanceDetectionDevice(2, 0,150));
        a.add(2, new CoronaDistanceDetectionDevice(3, 0,110));

        // creating a simmulation, where max distance is 30, and available devices is the list "devices"
        CoronaDeviceSimmulator sim = new CoronaDeviceSimmulator(minDistance, devices);

        // calling simmulation
        sim.simulation();

        // IF ONE IS INFECTED

        CoronaFound found = new CoronaFound(devices, devices.get(0));
        // corona found at device with id
//        System.out.println(found.coronaFound(devices.get(0)));




//        System.out.println(objToID(a));

    }

//    /**
//     * Remove duplicate elements
//     * @param arrID
//     * @return a trimmed list with no duplicates
//     */
//    public static ArrayList<CoronaDistanceDetectionDevice> removeDuplicates(ArrayList<Integer> arrID) {
//        ArrayList<Integer> trimmedList = new ArrayList<>();
//
//        for(CoronaDistanceDetectionDevice element : arr) {
//            if(!trimmedList.contains(element)) {
//                trimmedList.add(element);
//            }
//        }
//
//        return trimmedList;
//    }
//
//    public static ArrayList<CoronaDistanceDetectionDevice> idToObj(ArrayList<CoronaDistanceDetectionDevice> allObj, ArrayList<Integer> id) {
//        ArrayList<CoronaDistanceDetectionDevice> tempObjList = new ArrayList<>();
//
//        for(int i = 0; i < id.size(); i++) {
//            for(CoronaDistanceDetectionDevice o : allObj) {
//                if(id.get(i) == o.getID()) {
//                    tempObjList.add(o);
//                }
//            }
//        }
//
//        return tempObjList;
//    }
//
//    public static ArrayList<Integer> objToID(ArrayList<CoronaDistanceDetectionDevice> obj) {
//        ArrayList<Integer> tempIDList = new ArrayList<>();
//
//        for(CoronaDistanceDetectionDevice o : obj) {
//            tempIDList.add(o.getID());
//        }
//
//        return tempIDList;
//    }
}
