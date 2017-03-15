package com.Sam;

/**
 * Created by samagbeh on 2/13/17.
 */

import java.util.*;

public class RunningLakes {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    //Data that the RunningLakes object needs to store
    private ArrayList<Double> runTimes; //set up the runTimes arraylist

    //Constructor
    RunningLakes() {
        this.runTimes = new ArrayList<Double>();

    }

    public ArrayList<Double> GetAddRunTimes() {

        ArrayList<Double> runTimes = new ArrayList<Double>(); //creates runTimes arraylist to store run times
        System.out.println("How many run times do you want to add?");
        int num = numberScanner.nextInt(); //stores number of run times as num variable

        //iterates over the runTime Arraylist to add the times
        for (int x = 0; x < num; x++) {

            System.out.println("Enter run time " + (x + 1) + ": ");
            double time = numberScanner.nextDouble();
            runTimes.add(time);
            }

            return runTimes; //return runTimes arraylist
        }


    public double getFastestTime(ArrayList<Double> runTimes) {
        //returns the fastest run time
        double fastestTime = Collections.min(runTimes);
        return fastestTime;
        }


    }
