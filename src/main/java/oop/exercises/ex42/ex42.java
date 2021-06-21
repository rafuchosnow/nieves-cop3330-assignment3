/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex42 {
    private static final Scanner input = new Scanner(System.in);

    public static String outputString = "";

    public static void main(String[] args) {
        //Create list to add data
        ArrayList<String> dataList = new ArrayList<String>(Arrays.asList());

        //Create new class to include all table related methods
        DataTable DT = new DataTable();

        //Call method to read file
        //Save data to the list
        DT.readFile((ArrayList<String>) dataList);

        //Call method to sort out data
        //Return and save to Output
        outputString = DT.printTable((ArrayList<String>) dataList);

        //Print Output
        System.out.println(outputString);

    }


}
