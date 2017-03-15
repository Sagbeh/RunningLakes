package com.Sam;

import java.util.*;

/**
 * Created by samagbeh on 3/15/17.
 */
public class RunningLakesManager {

    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            // User can enter as many lakes as they want.  Enter q stop entering lakes/times
            System.out.println("Press any key to enter a lake and time, or Q to quit");
            String userInput = stringScanner.nextLine();

            if (userInput.equalsIgnoreCase("Q")) {

                break;
            }

            System.out.println("Enter the name of the lake: "); //user enters the name of the lake
            String lake = stringScanner.nextLine(); //lake name stored as a variable
            RunningLakes trainingData = new RunningLakes(); //creates new object trainingData
            ArrayList<Double> runTimes = trainingData.GetAddRunTimes(); //Calls the GetAddRunTimes method
            double fastestTime = trainingData.getFastestTime(runTimes);// Calls getFastestTime method

            //Prints the fastest run time for the lake
            System.out.println("Best run time for " + lake +
                    " lake: " + fastestTime);

        }

        stringScanner.close();

    }

}
