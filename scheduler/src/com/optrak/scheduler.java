package com.optrak;

public class scheduler {

    //Primary method. Takes the array of customers, travel times, opening times and visit time, and returns the schedule
    // for the driver, if one can be generated.
    public static int[] scheduleTrip(String[] customerArray, float[] travelTimes, float[][] openingTimes, float[] visitTimes){
        //Check the inputs are of correct dimensions
        if(!dataValid(customerArray,travelTimes,openingTimes,visitTimes)){
            return new int[0];
        }
        //Start by calculating te array of earliest arrival times and latest departure times
        float[] earliestArrivalTimes = generateEarliestArrivalTimes(travelTimes,openingTimes,visitTimes);
        float[] latestDepartureTimes = generateLatestDepartureTimes(travelTimes,openingTimes,visitTimes);




        return new int[4];
    }
    //A quick check that all the input arrays are of correct length.
    private static boolean dataValid(String[] customerArray, float[] travelTimes, float[][] openingTimes, float[] visitTimes){
        int numberOfCustomers = customerArray.length;
        if (travelTimes.length !=numberOfCustomers-1){
            return false;
        }
        if (openingTimes.length != numberOfCustomers){
            return false;
        }
        if (visitTimes.length != numberOfCustomers){
            return false;
        }
        return true;
    }

    private static float[] generateEarliestArrivalTimes(float[] travelTimes, float[][] openingTimes, float[] visitTimes){

    }

    private static float[] generateLatestDepartureTimes(float[] travelTimes, float[][] openingTimes, float[] visitTimes){

    }

}
