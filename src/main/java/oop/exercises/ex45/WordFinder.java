/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    private static final Scanner input = new Scanner(System.in);

    //Create method for reading file
    public static String readFile(String fileText){

        int i = 0;

        //Read file and add each line to the String
        try {
            File reader = new File("src\\main\\java\\oop\\exercises\\ex45\\exercise45_input.txt");
            Scanner fileReader = new Scanner(reader);

            //Add to String line by line
            while (fileReader.hasNextLine()) {
                fileText += fileReader.nextLine() + "\n";
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            fileText = "An error occurred.";
            e.printStackTrace();
        }

        return fileText;
    }

    //Create method to modify file and replace words
    public static String replaceWords(String fileText){

        //Replace words by desired substitute
        fileText = fileText.replaceAll("utilize", "use");

        return fileText;
    }

    //Create method that creates file
    //Create method that writes file
    public static void writeFile(String fileText) {

        //Prompt user to type file name
        System.out.print("Enter modified file name: ");
        String fileName = input.nextLine();

        try {
            //Create file path and select to write it
            FileWriter writer = new FileWriter("src\\main\\java\\oop\\exercises\\ex45\\" + fileName + ".txt");
            //Overwrite file with modified output
            writer.write(fileText);
            writer.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



}
