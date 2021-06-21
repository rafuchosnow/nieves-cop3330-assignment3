/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileManager {

    //Create method that reads file
    public static void readFile(ArrayList<String> namesList){
        String addList = "";
        int i = 0;

        //Read file and add each line to the list
        try {
            File reader = new File("src\\main\\java\\oop\\exercises\\ex41\\exercise41_input.txt");
            Scanner fileReader = new Scanner(reader);

            //Add to list name by name
            while (fileReader.hasNextLine()) {
                addList = fileReader.nextLine();
                namesList.add(addList);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            addList = "An error occurred.";
            e.printStackTrace();
        }
    }

    //Create method that sorts list from file
    public static String sortList(ArrayList<String> namesList){

        String sortedList;
        //Sort list alphabetically
        Collections.sort(namesList);

        sortedList = "Total of " + namesList.size() + " names: \n";

        //Print list name by name
        for (int i = 0; i < namesList.size(); i++){
            sortedList += namesList.get(i) + "\n";
        }

        return sortedList;
    }

    //Create method that creates file
    //Create method that writes file
    public static void writeFile(String outputString) {
        try {
            //Create file path and select to write it
            FileWriter writer = new FileWriter("src\\main\\java\\oop\\exercises\\ex41\\exercise41_output.txt");
            //Overwrite file with sorted output
            writer.write(outputString);
            writer.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
