/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Rafael Nieves
 */

package oop.exercises.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequency {

    //Create method to read file
    public static void readFile(ArrayList<String> wordList){

        String addList = "";

        //Read file and add each word to the list
        try {
            File reader = new File("src\\main\\java\\oop\\exercises\\ex46\\exercise46_input.txt");
            Scanner fileReader = new Scanner(reader);

            //Add to list word by word
            while (fileReader.hasNextLine()) {
                addList = fileReader.next();
                wordList.add(addList);
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            addList = "An error occurred.";
            e.printStackTrace();
        }

        //Sort words alphabetically
        Collections.sort(wordList);
    }

    //Create method to remove duplicate words
    public static void duplicateRemover(ArrayList<String> uniqueWordList) {

        for (int i = 1 ; i <= uniqueWordList.size()-1 ; i++) {
            if (uniqueWordList.get(i).equals(uniqueWordList.get(i-1))) {
                uniqueWordList.remove(i);
                i--;
            }
        }
    }

    //Create method for comparing list
    //Create method to concatenate output
    public static String printTable(ArrayList<String> wordList, ArrayList<String> uniqueWordList, HashMap<String, String> wordTable) {

        String outputString = "";
        String counter = "";

        for (int i = 0 ; i <= uniqueWordList.size()-1 ; i++) {

            for (int j = 0 ; j <= wordList.size()-1 ; j++) {

                //Compare unique word list with unmodified list
                if (uniqueWordList.get(i).equals(wordList.get(j))){
                    //Count times the words are repeated
                    counter += "*";
                }
            }
            //Save words and counter to map
            wordTable.put(uniqueWordList.get(i) + " : ", "\t\t" + counter + "\n");
            counter = "";
        }

        //Concatenate map to String
        for (String i : wordTable.keySet()) {
            outputString += i  + wordTable.get(i);
        }

        return outputString;
    }

}
