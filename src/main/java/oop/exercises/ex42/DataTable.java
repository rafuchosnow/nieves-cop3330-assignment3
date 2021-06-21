/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataTable {

    //Create method that reads file
    public static void readFile(ArrayList<String> dataList){
        String addList = "";
        int i = 0;

        //Read file and add each line to the list
        try {
            File reader = new File("src\\main\\java\\oop\\exercises\\ex42\\exercise42_input.txt");
            Scanner fileReader = new Scanner(reader);

            //Add to list line by line
            while (fileReader.hasNextLine()) {
                addList = fileReader.next();

                dataList.add(addList);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            addList = "An error occurred.";
            e.printStackTrace();
        }
    }

    //Create method that modifies the list
    //Create method that prints the table
    public static String printTable(ArrayList<String> dataList){
        String spacing = "";

        String formattedTable;

        formattedTable = "Last\t\t\tFirst\t\t\tSalary \n" +
                "--------------------------------------------\n";

        //Print list name by name
        for (int i = 0; i < dataList.size(); i++){
            formattedTable += dataList.get(i) + "\n";
        }

        //Replace every comma with tabs to separate data
        formattedTable = formattedTable.replaceAll(",", "\t\t\t");
        return formattedTable;
    }
}