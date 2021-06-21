/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex41 {
    private static final Scanner input = new Scanner(System.in);

    public static String outputString = "";


    public static void main(String[] args) {
        //Create list to add names
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList());

        //Create new class to include all file related methods
        FileManager FM = new FileManager();

        //Read text file and save to list
        FM.readFile(namesList);

        //Save sorted name list
        outputString = FM.sortList(namesList);

        //Create new text file
        //Add sorted list to file
        FM.writeFile(outputString);

        // Test: Print output
        //System.out.println(outputString);
    }
}
